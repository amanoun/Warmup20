package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Logic2EvenlySpacedTest {

    Logic2EvenlySpaced logic2EvenlySpaced = new Logic2EvenlySpaced();

    @Test
    public void evenlySpacedShouldeturnTrueIfTheDifferenceBetween2And4And6IsEqual() {
        assertTrue(logic2EvenlySpaced.evenlySpaced(2, 4, 6));
    }

    @Test
    public void evenlySpacedShouldeturnTrueIfTheDifferenceBetween2And6And2IsEqual() {
        assertTrue(logic2EvenlySpaced.evenlySpaced(4, 6, 2));
    }

    @Test
    public void evenlySpacedShouldeturnFalseIfTheDifferenceBetween2And6And2IsNotEqual() {
        assertFalse(logic2EvenlySpaced.evenlySpaced(4, 6, 3));
    }


    @Test
    public void evenlySpacedShouldeturnFalseIfTheDifferenceBetween6And2And4IsEqual() {
        assertTrue(logic2EvenlySpaced.evenlySpaced(6, 2, 4));
    }

    @Test
    public void evenlySpacedShouldeturnFalseIfTheDifferenceBetween6And2And8IsNotEqual() {
        assertFalse(logic2EvenlySpaced.evenlySpaced(6, 2, 8));
    }

    @Test
    public void evenlySpacedShouldeturnFalseIfTheDifferenceBetween2And2And3IsNotEqual() {
        assertFalse(logic2EvenlySpaced.evenlySpaced(2, 2, 3));
    }


    @Test
    public void evenlySpacedShouldeturnTrueIfTheDifferenceBetween2And2And2IsEqual() {
        assertTrue(logic2EvenlySpaced.evenlySpaced(2, 2, 2));
    }

    @Test
    public void evenlySpacedShouldeturnFalseIfTheDifferenceBetween3And6And12IsNotEqual() {
        assertFalse(logic2EvenlySpaced.evenlySpaced(3, 6, 12));
    }
}