public class MidExam {

     protected int year;
     protected String semester;
     protected String course;
     
     public MidExam(String course, String semester, int year) {
            if (year < 2010 || year > 2023) {
                 throw new IllegalArgumentException("wrong year used!");
            }
            this.year = year;
            this.semester = semester;
            this.course = course;
     }
     
     public String toString() {
            return String.format("%d-%s-%s", year, semester, course);
     }
}