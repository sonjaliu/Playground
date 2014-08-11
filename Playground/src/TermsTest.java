import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TermsTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetLossOne() throws Exception {
        Terms TestOne = new Terms (100, 50, 20);
        double result = TestOne.getLoss();
        assertTrue(result==30.0);
    }
    @Test
    public void testGetLossTwo() throws Exception {
        Terms TestOne = new Terms (100, 50, 20);
        double result = TestOne.getLoss();
        assertTrue(result==50.0);
    }
}