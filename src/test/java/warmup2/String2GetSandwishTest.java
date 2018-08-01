package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class String2GetSandwishTest {

    private String2GetSandwish string2GetSandwish = new String2GetSandwish();

    @Test
    public void getSandwishSHouldReturnJamWhenBreadjambreadIsPassed() {
        assertEquals("jam", string2GetSandwish.getSandwish("breadjambread"));
    }

    @Test
    public void getSandwishSHouldReturnJamWhenBreadyyjambreadIsPassed() {
        assertEquals("jam", string2GetSandwish.getSandwish("breadjambreadyy"));
    }

    @Test
    public void getSandwishSHouldReturnAnEmptyStringWhenXxbreadyyIsPassed() {
        assertEquals("", string2GetSandwish.getSandwish("xxbreadyy"));
    }

    @Test
    public void getSandwishSHouldReturnBreadjamWhenXxbreadbreadjambreadyyIsPassed() {
        assertEquals("breadjam", string2GetSandwish.getSandwish("xxbreadbreadjambreadyy"));
    }

    @Test
    public void getSandwishSHouldReturnYWhenBreaxbreadybreadIsPassed() {
        assertEquals("y", string2GetSandwish.getSandwish("breaxbreadybread"));
    }

    @Test
    public void getSandwishSHouldReturnBreadbreadWhenBreadbreadbreadbreadIsPassed() {
        assertEquals("breadbread", string2GetSandwish.getSandwish("breadbreadbreadbread"));
    }
}