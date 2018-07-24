package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringStartWordTest {

    StringStartWord stringStartWord = new StringStartWord();

    @Test
    public void startWordShouldReturnHi() {
        assertEquals("hi", stringStartWord.startWord("hippo", "hi"));
    }

    @Test
    public void startWordShouldReturnHip() {
        StringStartWord stringStartWord = new StringStartWord();
        assertEquals("hip", stringStartWord.startWord("hippo", "xip"));
    }

    @Test
    public void startWordShouldReturnH() {
        assertEquals("h", stringStartWord.startWord("hippo", "i"));
    }

    @Test
    public void startWordShouldReturnEmptyWhenNomatchFound() {
        assertEquals("", stringStartWord.startWord("h", "ix"));
    }

    @Test
    public void startWordShouldReturnEmptyWhenStrisempty() {
        assertEquals("", stringStartWord.startWord("", "i"));
    }
}