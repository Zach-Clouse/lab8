import java.util.Scanner;

public class DigitalMovie extends Movie implements Streamable {
    
    protected int size;
    
    public DigitalMovie(String title, int year, int size) {
        super(title, year);
        this.size = size;
    }
    
    public String toString() {
        
    }
    
    public void play() {
        
    }
    
    public int getSize() {
        return this.size;
    }
    
    @Override
    public DigitalMovie clone() {
        return new DigitalMovie(this);
    }
    
    public MovieBuff(MovieBuff src) {
        this.name = src.name;
        this.price = src.price;
        this.boxOffice = new DigitalMovie[src.boxOffice];
    }
    
    
    ArrayList<Movie> loadMovies(String fileName) 
            throws FileNotFoundException {
        File file = new File(fileName);
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            Scanner lineReader = new Scanner(line);
            String word = lineReader.next();
            if (word == "DigitalMovie") {
                DigitalMovie d1 = new DigitalMovie(lineReader.next(),
                        lineReader.nextInt(), lineReader.nextInt());
                boxOffice.add(d1);
            } else if (word == "DvdMovie") {
                DvdMovie d2 = new DvdMovie(lineReader.next(),
                        lineReader.nextInt());
                boxOffice.add(d2);
            }
        }
    }
    
    long getTotalSize(ArrayList<Object> objs) {
        long count = 0;
        for (Object ob : objs) {
            if (ob instanceof DigitalMovie) {
                count++;
            }
        }
        return count;
    }
    
}
