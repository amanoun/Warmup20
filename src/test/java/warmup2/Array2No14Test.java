package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Array2No14Test {

    Array2No14 array2No14 = new Array2No14();

    @Test
    public void no14ShouldReturnTrueWhenEither1Or4IsNotContainedWhen123IsPassed() {
        int a[] = {1, 2, 3};
        assertTrue(array2No14.no14(a));
    }

    @Test
    public void no14ShouldReturnFalseWhenEither1Or4IsNotContainedWhen1234IsPassed() {
        int a[] = {1, 2, 3, 4};
        assertFalse(array2No14.no14(a));
    }

    @Test
    public void no14ShouldReturnTrueWhenEither1Or4IsNotContainedWhen234IsPassed() {
        int a[] = { 2, 3, 4};
        assertTrue(array2No14.no14(a));
    }

    @Test
    public void no14ShouldReturnTrueWhenEither1Or4IsNotContainedWhenEmptyIsPassed() {
        int a[] = {};
        assertTrue(array2No14.no14(a));
    }

    @Test
    public void no14ShouldReturnTrueWhenEither1Or4IsNotContainedWhen1IsPassed() {
        int a[] = {1};
        assertTrue(array2No14.no14(a));
    }



}