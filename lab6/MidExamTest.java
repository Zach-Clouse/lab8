import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MidExamTest{

    @Test (expected = IllegalArgumentException.class)
    public void testMidExamIllegal() {
        MidExam m1 = new MidExam("red", "fall", 2010);
        MidExam m2 = new MidExam("blue", "spring", 2024);
        
    }
    
    @Test
    public void testMidExam() {
        MidExam m1 = new MidExam("red", "spring", 2013);
        assertTrue(m1.year == 2013);
        assertTrue(m1.semester == "spring");
        assertTrue(m1.course == "red");
    }

}
