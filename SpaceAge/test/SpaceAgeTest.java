import org.junit.Test;

import static org.junit.Assert.*;

public class SpaceAgeTest {

    private static final double MAXIMUM_DELTA = 1E-02;

    @Test
    public void onEarth() {
        SpaceAge test = new SpaceAge(1000000000);
        double expResult = 31.69;

        assertEquals(expResult, test.onEarth(), MAXIMUM_DELTA);
    }

    @Test
    public void getSeconds() {
        SpaceAge test = new SpaceAge(1);
        double expResult = 31557600;

        assertEquals(expResult, test.getSeconds(), MAXIMUM_DELTA);
    }

    @Test
    public void onMercury() {
        SpaceAge test = new SpaceAge(2134835688);
        double expResult = 280.88;

        assertEquals(expResult,test.onMercury(), MAXIMUM_DELTA);
    }

    @Test
    public void onVenus() {
        SpaceAge test = new SpaceAge(189839836);
        double expResult = 9.78;

        assertEquals(expResult,test.onVenus(), MAXIMUM_DELTA);
    }

    @Test
    public void onMars() {
        SpaceAge test = new SpaceAge(2129871239L);
        double expResult = 35.88;

        assertEquals(expResult,test.onMars(), MAXIMUM_DELTA);
    }

    @Test
    public void onJupiter() {
        SpaceAge test = new SpaceAge(901876382);
        double expResult = 2.41;

        assertEquals(expResult, test.onJupiter(), MAXIMUM_DELTA);
    }

    @Test
    public void onSaturn() {
        SpaceAge test = new SpaceAge(2000000000L);
        double expResult = 2.15;

        assertEquals(expResult, test.onSaturn(), MAXIMUM_DELTA);
    }

    @Test
    public void onUranus() {
        SpaceAge test = new SpaceAge(1210123456L);
        double expResult = 0.46;

        assertEquals(expResult, test.onUranus(), MAXIMUM_DELTA);
    }

    @Test
    public void onNeptune() {
        SpaceAge test = new SpaceAge(1821023456L);
        double expResult = 0.35;

        assertEquals(expResult, test.onNeptune(), MAXIMUM_DELTA);
    }
}