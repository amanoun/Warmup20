package warmup2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayReverse3Test {

    ArrayReverse3 arrayReverse3 = new ArrayReverse3();

    @Test
    public void reverse3ShouldReturn123InReverseOrder() {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};
        assertTrue(Arrays.equals(b, arrayReverse3.reverse3(a)));
    }

    @Test
    public void reverse3ShouldReturn5And11And9InReverseOrder() {
        int[] a = {5, 11, 9};
        int[] b = {9, 11, 5};
        assertTrue(Arrays.equals(b, arrayReverse3.reverse3(a)));
    }


    @Test
    public void reverse3ShouldReturn7And0And0InReverseOrder() {
        int[] a = {7, 0, 0};
        int[] b = {0, 0, 7};
        assertTrue(Arrays.equals(b, arrayReverse3.reverse3(a)));
    }
}
