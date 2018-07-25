package warmup2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayMaxTribleTest {

    ArrayMaxTrible arrayMaxTrible = new ArrayMaxTrible();

    @Test
    public void maxTripleShouldReturnTheMaxBetween1And2And3() {
        int a[] = {1, 2, 3};
        assertEquals(3, arrayMaxTrible.maxTriple(a));

    }

    @Test
    public void maxTripleShouldReturnTheMaxBetween1And5And3() {
        int a[] = {1, 5, 3};
        assertEquals(5, arrayMaxTrible.maxTriple(a));

    }

    @Test
    public void maxTripleShouldReturnTheMaxBetween5And2And3() {
        int a[] = {5, 2, 3};
        assertEquals(5, arrayMaxTrible.maxTriple(a));

    }

    @Test
    public void maxTripleShouldReturnTheMaxBetweenFirstMiddleAndLast() {
        int a[] = {1, 2, 3, 1, 1};
        assertEquals(3, arrayMaxTrible.maxTriple(a));

    }

    @Test
    public void maxTripleShouldReturnFirstIfArrayLengthIs1() {
        int a[] = {1};
        assertEquals(1, arrayMaxTrible.maxTriple(a));

    }
}