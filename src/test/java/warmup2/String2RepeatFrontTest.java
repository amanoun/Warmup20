package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class String2RepeatFrontTest {

    private String2RepeatFront string2RepeatFront = new String2RepeatFront();

    @Test
    public void repeatFrontShouldReturnFirst4CharsAndFirst4Minus1CharsWhenPassingChocolateAnd4() {
        assertEquals("ChocChoChC", string2RepeatFront.repeatFront("Chocolate", 4));
    }

    @Test
    public void repeatFrontShouldReturnFirst3CharsAndFirst3Minus1CharsWhenPassingChocolateAnd3() {
        assertEquals("ChoChC", string2RepeatFront.repeatFront("Chocolate", 3));
    }

    @Test
    public void repeatFrontShouldReturnFirst2CharsAndFirst2Minus1CharsWhenPassingIceCreamAnd2() {
        assertEquals("IcI", string2RepeatFront.repeatFront("Ice Cream", 2));
    }

    @Test
    public void repeatFrontShouldRturnAnEmptytringWhenPassing0AndIceCream() {
        assertEquals("", string2RepeatFront.repeatFront("Ice Cream", 0));
    }
}