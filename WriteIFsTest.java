

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WriteIFsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WriteIFsTest
{
    private static final double _0_5 = 0.5;
    private static final double _0_04 = 0.04;

    /**
     * Default constructor for test class WriteIFsTest
     */
    public WriteIFsTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestIfs()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        writeIFs1.playerDied(true);
        assertEquals("Game Over!", writeIFs1.ss);
    }


    @Test
    public void TestTherm()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        assertEquals("heating", writeIFs1.thermoSTAT(62));
    }
    @Test
    public void TestTherm1()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        assertEquals("cooling", writeIFs1.thermoSTAT(81));
    }
    @Test
    public void TestCheckFuel()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        writeIFs1.playerDied(true);
        assertEquals("Game Over!", writeIFs1.ss);
    }
    @Test
    public void TestFireControl()
    {
        WriteIFs writeIFs1 = new WriteIFs();
        writeIFs1.checkFuel(_0_5);
        assertEquals(0, writeIFs1.x);
        writeIFs1.checkFuel(_0_04);
        assertEquals(99, writeIFs1.x);
    }

}


