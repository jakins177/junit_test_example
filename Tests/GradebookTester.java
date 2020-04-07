import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradebookTester {

    Gradebook g1;

    @Before
    public void setUp() throws Exception {
         g1 = new Gradebook(5);
        //Gradebook myGradbook2 = new Gradebook(5);


        g1.addScore(50);

        g1.addScore(75);


    }

    @After
    public void tearDown() throws Exception {
        g1 = null;
    }

    @Test
   public void testSum() {
        assertEquals(125, g1.sum(), .0001);
    }

    @Test
    public void testMinimum() {
        assertEquals(50, g1.minimum(), .001);
    }

    @Test
    public void addScoreTest() {

        assertTrue(g1.toString().equals("50.0 75.0 "));
    }





}