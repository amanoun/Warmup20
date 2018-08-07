package warmup2;


import org.junit.Test;


import java.util.Arrays;

import static org.junit.Assert.*;

public class Array2ShiftLeftTest {

    private Array2ShiftLeft array2ShiftLeft = new Array2ShiftLeft();

    @Test
    public void shiftLeftShouldReturnArryWithFirstElementLeftedToTheEndWhen6253ArePassed() {
        int a[] = {6, 2, 5, 3};
        int b[] = {2, 5, 3, 6};
        assertArrayEquals(b, array2ShiftLeft.shiftLeft(a));
    }

    @Test
    public void shiftLeftShouldReturnArryWithFirstElementLeftedToTheEndWhen12ArePassed() {
        int a[] = {1, 2};
        int b[] = {2, 1};
        assertArrayEquals(b, array2ShiftLeft.shiftLeft(a));
    }

    @Test
    public void shiftLeftShouldReturnArryWithFirstElementLeftedToTheEndWhen1IsPassed() {
        int a[] = {1};
        int b[] = {1};
        assertArrayEquals(b, array2ShiftLeft.shiftLeft(a));
    }

    @Test
    public void shiftLeftShouldReturnArryWithFirstElementLeftedToTheEndWhen11224ArePassed() {
        int a[] = {6, 2, 5, 3, 9};
        int b[] = {2, 5, 3, 9, 6};
        assertArrayEquals(b, array2ShiftLeft.shiftLeft(a));
    }

    @Test
    public void shiftLeftShouldReturnArryWithFirstElementLeftedToTheEndWhenEmptyArrayIsPassed() {
        int a[] = {};
        int b[] = {};
        assertArrayEquals(b, array2ShiftLeft.shiftLeft(a));
    }

    @Test
    public void shiftLeftShouldReturnArryWithFirstElementLeftedToTheEndWhen123ArePassed() {
        int a[] = {1, 2, 3};
        int b[] = {2, 3, 1};
        assertArrayEquals(b, array2ShiftLeft.shiftLeft(a));
    }
}