import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class UndergraduateTest {

    @Test
    public void testCompareTo() {
        Undergraduate u1 = new Undergraduate("earl");
        Undergraduate u2 = new Undergraduate("earl");
        u1.addScore(10);
        u2.addScore(10);
        Undergraduate u3 = new Undergraduate("sal");
        assertSame(0, u1.compareTo(u2));
        assertSame(-1, u2.compareTo(u3));
    }

    @Test
    public void testClone() {
        Undergraduate u1 = new Undergraduate("earl");
        u1.addScore(10);
        Undergraduate u2 = u1.clone();
        assertTrue(u1.getAverageScore() == u2.getAverageScore());
    }

    @Test
    public void testAddScore() {
        Undergraduate u1 = new Undergraduate("sally");
        u1.addScore(15);
        u1.addScore(30);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        Undergraduate u1 = new Undergraduate("sally");
        u1.addScore(-1);
    }

    @Test
    public void testGetLetterGrade() {
        Undergraduate u1 = new Undergraduate("earl");
        u1.addScore(39);
        char grade = u1.getLetterGrade();
        u1.addScore(100);
        grade = u1.getLetterGrade();
        u1.addScore(100);
        grade = u1.getLetterGrade();
        u1.addScore(100);
        grade = u1.getLetterGrade();
        u1.addScore(100);
    }
    
    @Test
    public void testEquals() {
        Undergraduate u1 = new Undergraduate("earl");
        Undergraduate u2 = new Undergraduate("earl");
        u1.addScore(10);
        u2.addScore(10);
        Undergraduate u3 = new Undergraduate("sal");
        assertTrue(u1.equals(u2));
        assertTrue(u2.equals(u3));
    }

}
