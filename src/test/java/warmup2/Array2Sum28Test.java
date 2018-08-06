package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Array2Sum28Test {

    Array2Sum28 array2Sum28 = new Array2Sum28();

    @Test
    public void sum28ShouldReturnTrueWhenTheSumOf2IsEqualTo8When232242IsPassed() {
        int a[] = {2, 3, 2, 2, 4, 2};
        assertTrue(array2Sum28.sum28(a));
    }

    @Test
    public void sum28ShouldReturnFalseWhenTheSumOf2IsNotEqualTo8When2322422IsPassed() {
        int a[] = {2, 3, 2, 2, 4, 2, 2};
        assertFalse(array2Sum28.sum28(a));
    }

    @Test
    public void sum28ShouldReturnFalseWhenTheSumOf2IsNotEqualTo8When1234IsPassed() {
        int a[] = {1, 2, 3, 4};
        assertFalse(array2Sum28.sum28(a));
    }

    @Test
    public void sum28ShouldReturnFalseWhenTheSumOf2IsNotEqualTo8WhenEmptyIsPassed() {
        int a[] = {};
        assertFalse(array2Sum28.sum28(a));
    }


    @Test
    public void sum28ShouldReturnTrueWhenTheSumOf2IsEqualTo8When2222IsPassed() {
        int a[] = {2, 2, 2, 2};
        assertTrue(array2Sum28.sum28(a));
    }

}