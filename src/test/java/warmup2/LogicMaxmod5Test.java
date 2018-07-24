package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicMaxmod5Test {

    LogicMaxmod5 logicMaxmod5 = new LogicMaxmod5();

    @Test
    public void maxMod5ShouldReturn3When2And3Passed() {
        assertEquals(3, logicMaxmod5.maxMod5(2, 3));
    }


    @Test
    public void maxMod6ShouldReturn6When6And2Passed() {
        assertEquals(6, logicMaxmod5.maxMod5(6, 2));
    }

    @Test
    public void maxMod6ShouldReturn3When3And2Passed() {
        assertEquals(3, logicMaxmod5.maxMod5(3, 2));
    }


    @Test
    public void maxMod6ShouldReturn12When8And12Passed() {
        assertEquals(12, logicMaxmod5.maxMod5(8, 12));
    }

    @Test
    public void maxMod6ShouldReturn7When7And12Passed() {
        assertEquals(7, logicMaxmod5.maxMod5(7, 12));
    }

    @Test
    public void maxMod6ShouldReturn6When11And6Passed() {
        assertEquals(6, logicMaxmod5.maxMod5(11, 6));
    }

    @Test
    public void maxMod6ShouldReturn0When7And7Passed() {
        assertEquals(0, logicMaxmod5.maxMod5(7 , 7));
    }
}