package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class String2PlusOutTest {

    String2PlusOut string2PlusOut = new String2PlusOut();

    @Test
    public void plusOutShouldReturnTheStringXyIfItApearsIn12xy34WithTheRestOfCharsConvertedToPlusSign() {
        assertEquals("++xy++", string2PlusOut.plusOut("12xy34", "xy"));
    }

    @Test
    public void plusOutShouldReturnTheString1IfItApearsIn12xy34WithTheRestOfCharsConvertedToPlusSign() {
        assertEquals("1+++++", string2PlusOut.plusOut("12xy34", "1"));
    }

    @Test
    public void plusOutShouldReturnTheStringXyIfItApearsIn12xy34xyabcxyWithTheRestOfCharsConvertedToPlusSign() {
        assertEquals("++xy++xy+++xy", string2PlusOut.plusOut("++xy++xy+++xy", "xy"));
    }

    @Test
    public void plusOutShouldReturnTheStringAbIfItApearsIn12xy34xyabcxyWithTheRestOfCharsConvertedToPlusSign() {
        assertEquals("ab++ab++++", string2PlusOut.plusOut("abXYabcXYZ", "ab"));
    }

    @Test
    public void plusOutShouldReturnTheStringXyzIfApearsInabXYxyzXYZithTheRestOfCharsConvertedToPlusSign() {
        assertEquals("+++++++XYZ", string2PlusOut.plusOut("abXYxyzXYZ", "XYZ"));
    }
}