package warmup2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayFront11Test {

    ArrayFront11 arrayFront11 = new ArrayFront11();

    @Test
    public void front11ShouldReturnNewArrayOfFirstElemnetsOfAAndB() {
        int a[] = {1, 2, 3};
        int b[] = {7, 8, 9};
        int c[] = {1, 7};
        assertArrayEquals(c, arrayFront11.front11(a, b));
    }

    @Test
    public void front11ShouldReturnAnewArrayHas1And2() {
        int a[] = {1};
        int b[] = {2};
        int c[] = {1, 2};
        assertArrayEquals(c, arrayFront11.front11(a, b));
    }

    @Test
    public void front11ShouldReturnAnewArrayOfFirstElementOfAWhenBIsEmpty() {
        int a[] = {1, 7};
        int b[] = {};
        int c[] = {1};
        assertArrayEquals(c, arrayFront11.front11(a, b));
    }

    @Test
    public void front11ShouldReturnAnewArrayOfFirstElementOfbWhenAIsEmpty() {
        int a[] = {};
        int b[] = {2, 8};
        int c[] = {2};
        assertArrayEquals(c, arrayFront11.front11(a, b));
    }

    @Test
    public void front11ShouldReturnAnewEmptyArrayWhenAIsEmptyAndBIsEmpty() {
        int a[] = {};
        int b[] = {};
        int c[] = {};
        assertArrayEquals(c, arrayFront11.front11(a, b));
    }



}