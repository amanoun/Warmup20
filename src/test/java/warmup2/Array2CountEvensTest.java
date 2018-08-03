package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Array2CountEvensTest {

    private Array2CountEvens array2CountEvens = new Array2CountEvens();

    @Test
    public void countEvensShouldReturn3AsTheCountOfEvenNumbersWhen21234ArePassed() {
        int a[] = {2, 1, 2, 3, 4};
        assertEquals(3, array2CountEvens.countEvens(a));
    }

    @Test
    public void countEvensShouldReturn3AsTheCountOfEvenNumbersWhen220ArePassed() {
        int a[] = {2, 2, 0};
        assertEquals(3, array2CountEvens.countEvens(a));
    }

    @Test
    public void countEvensShouldReturn0AsTheCountOfEvenNumbersWhen135ArePassed() {
        int a[] = {1, 3, 5};
        assertEquals(0, array2CountEvens.countEvens(a));
    }


    @Test
    public void countEvensShouldReturn0AsTheCountOfEvenNumbersWhenEmptyArrayIsPassed() {
        int a[] = {};
        assertEquals(0, array2CountEvens.countEvens(a));
    }


    @Test
    public void countEvensShouldReturn1AsTheCountOfEvenNumbersWhen11901ArePassed() {
        int a[] = {11, 9, 0, 1};
        assertEquals(1, array2CountEvens.countEvens(a));
    }
}