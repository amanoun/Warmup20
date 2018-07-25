package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Logic2RoundSumTest {

        Logic2RoundSum logic2RoundSum =new Logic2RoundSum();

    @Test
    public void roundSumShouldReturn60When16And17And18ArePassed() {
        assertEquals(60,logic2RoundSum.roundSum(16,17,18));
    }

    @Test
    public void roundSumShouldReturn30When12And13And14ArePassed() {
        assertEquals(30,logic2RoundSum.roundSum(12,13,14));
    }

    @Test
    public void roundSumShouldReturn10When0And9And0ArePassed() {
        assertEquals(10,logic2RoundSum.roundSum(0,9,0));
    }

    @Test
    public void roundSumShouldReturn100When45And21And30ArePassed() {
        assertEquals(100,logic2RoundSum.roundSum(45,21,30));
    }
}
