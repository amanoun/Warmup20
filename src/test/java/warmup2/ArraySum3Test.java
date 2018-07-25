package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraySum3Test {

        ArraySum3 arraySum3 = new ArraySum3();
    @Test
    public void sum3ShouldReturnTheSumOf1And2And3() {
        assertEquals(6,arraySum3.sum3(new int[]{1,2,3}));
    }

    @Test
    public void sum3ShouldReturnTheSumOf5And11And2() {
        int[] a = {5, 11, 2};
        assertEquals(18,arraySum3.sum3(a));
    }


    @Test
    public void sum3ShouldReturnTheSumOf7And0And0() {
        int[] a = {7, 0, 0};
        assertEquals(7,arraySum3.sum3(a));
    }
}