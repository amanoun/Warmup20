package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class String2BobThereTest {

    private String2BobThere string2BobThere = new String2BobThere();

    @Test
    public void bobThereShouldReturnTrueIfTheStringContainsBobWhenAbcbobIsPassed() {
        assertTrue(string2BobThere.bobThere("abcbob"));

    }

    @Test
    public void bobThereShouldReturnTrueIfTheStringContainsBobWhenB9bIsPassed() {
        assertTrue(string2BobThere.bobThere("b9b"));

    }

    @Test
    public void bobThereShouldReturnFalseIfTheStringDoesntContainsBobWhenBacIsPassed() {
        assertFalse(string2BobThere.bobThere("bac"));

    }

    @Test
    public void bobThereShouldReturnTrueIfTheStringContainsBobWhen123abcbcdbabxyzIsPassed() {
        assertTrue(string2BobThere.bobThere("123abcbcdbabxyz"));

    }

    @Test
    public void bobThereShouldReturnFalseIfTheStringDoesntContainsBobWhenBbcIsPassed() {
        assertFalse(string2BobThere.bobThere("bbc"));

    }


}