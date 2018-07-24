package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringDeFrontTest {
    StringDeFront stringDeFront = new StringDeFront();

    @Test
    public void stringDeFrontShouldReturnLloWhenHelloIsPassed() {
        assertEquals("llo", stringDeFront.deFront("Hello"));
    }

    @Test
    public void stringDeFrontShouldReturnVaWhenJavaIsPassed() {
        assertEquals("va", stringDeFront.deFront("java"));
    }

    @Test
    public void stringDeFrontShouldReturnAayWhenAwayIsPassed() {
        assertEquals("aay", stringDeFront.deFront("away"));
    }

    @Test
    public void stringDeFrontShouldReturnAbWhenAbIsPassed() {
        assertEquals("ab", stringDeFront.deFront("ab"));
    }

    @Test
    public void stringDeFrontShouldReturnByWhenXbyIsPassed() {
        assertEquals("by", stringDeFront.deFront("xby"));
    }
}