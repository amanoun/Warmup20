package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicSumLimitTest {

    LogicSumLimit logicSumLimit = new LogicSumLimit();

    @Test
    public void sumLimitShouldReturn5When2And3Passed() {
        assertEquals(5, logicSumLimit.sumLimit(2, 3));
    }

    @Test
    public void sumLimitShouldReturn8When8And3Passed() {
        assertEquals(8, logicSumLimit.sumLimit(8, 3));
    }

    @Test
    public void sumLimitShouldReturn9When8And1Passed() {
        assertEquals(9, logicSumLimit.sumLimit(8, 1));
    }

    @Test
    public void sumLimitShouldReturn50When11And39Passed() {
        assertEquals(50, logicSumLimit.sumLimit(11, 39));
    }

    @Test
    public void sumLimitShouldReturnAWhenTheSumIsOneMoreDigit() {
        assertEquals(99, logicSumLimit.sumLimit(99, 1));
    }
    @Test
    public void sumLimitShouldReturnSUmWhenTheSumIsSameDigitsAsA() {
        assertEquals(90000001, logicSumLimit.sumLimit(90000000, 1));
    }

}