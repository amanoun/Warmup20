package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringMakeTagsTest {

    StringMakeTags stringMakeTags = new StringMakeTags();

    @Test
    public void makeTagsShouldReturnYayWithTags() {
        assertEquals("<i>Yay</i>", stringMakeTags.makeTags("i", "Yay"));

    }

    @Test
    public void makeTagsShouldReturnHelloWithTags() {
        assertEquals("<i>Hello</i>", stringMakeTags.makeTags("i", "Hello"));

    }

    @Test
    public void makeTagsShouldReturnYayWithCiteTags() {
        assertEquals("<cite>Yay</cite>", stringMakeTags.makeTags("cite", "Yay"));

    }

    @Test
    public void makeTagsShouldReturnIAsTagsOnly() {
        assertEquals("<i></i>", stringMakeTags.makeTags("i", ""));

    }
}