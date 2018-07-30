package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class String2EndOtherTest {

    String2EndOther string2EndOther = new String2EndOther();

    @Test
    public void endOtherShouldReturTrueIfStringAEndsWithStringBWhenPassingHiabcAndAbc() {
        assertTrue(string2EndOther.endOther("Hiabc", "abc"));

    }

    @Test
    public void endOtherShouldReturTrueIfStringAEndsWithStringBWhenPassingAbCAndHiaBc() {
        assertTrue(string2EndOther.endOther("AbC", "HiaBc"));

    }

    @Test
    public void endOtherShouldReturTrueIfStringAEndsWithStringBWhenPassingAbcAndabXabc() {
        assertTrue(string2EndOther.endOther("abc", "abXabc"));

    }

    @Test
    public void endOtherShouldReturFalseIfStringAEndsWithStringBWhenPassingHiabcAndabcd() {
        assertFalse(string2EndOther.endOther("Hiabc", "abcd"));

    }

    @Test
    public void endOtherShouldReturFalseIfStringAEndsWithStringBWhenPassingYzAnd12xz() {
        assertFalse(string2EndOther.endOther("yz", "12xz"));

    }
}