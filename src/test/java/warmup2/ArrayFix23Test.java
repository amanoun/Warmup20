package warmup2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayFix23Test {
    ArrayFix23 arrayFix23 = new ArrayFix23();

    @Test
    public void fix23ShouldTurn3To0WhenThers2AheadOfIt() {
        int a[] = {1, 2, 3};
        int b[] = {1, 2, 0};
        assertTrue(Arrays.equals(b, arrayFix23.fix23(a)));
    }

    @Test
    public void fix23ShouldReturn2And0And5() {
        int a[] = {2, 3, 5};
        int b[] = {2, 0, 5};
        assertTrue(Arrays.equals(b, arrayFix23.fix23(a)));
    }

    @Test
    public void fix23ShouldReturn1And2And1() {
        int a[] = {1, 2, 1};
        int b[] = {1, 2, 1};
        assertTrue(Arrays.equals(b, arrayFix23.fix23(a)));
    }
}