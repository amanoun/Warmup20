package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class String2WordEndsTest {

    String2WordEnds string2WordEnds = new String2WordEnds();

    @Test
    public void wordEndsShouldReturnANewStringMadeOfTheCharsComeBeforeAndAfterXYyWhenabcXY123XYijkIsPassed() {
        assertEquals("c13i", string2WordEnds.wordEnds("abcXY123XYijk", "XY"));
    }

    @Test
    public void wordEndsShouldReturnANewStringMadeOfTheCharsComeBeforeAndAfterXYyWhenabXY123XYIsPassed() {
        assertEquals("13", string2WordEnds.wordEnds("XY123XY", "XY"));
    }


    @Test
    public void wordEndsShouldReturnANewStringMadeOfTheCharsComeBeforeAndAfterXYyWhenabXY1XYsPassed() {
        assertEquals("11", string2WordEnds.wordEnds("XY1XY", "XY"));
    }

    @Test
    public void wordEndsShouldReturnAnEmptyStringWhenXyyAndXyIsPassed() {
        assertEquals("", string2WordEnds.wordEnds("XY", "XY"));
    }

    @Test
    public void wordEndsShouldReturnANewStringMadeOfTheCharsComeBeforeAndAfter1WhenAbc1xyz1i1jPassed() {
        assertEquals("cxziij", string2WordEnds.wordEnds("abc1xyz1i1j", "1"));
    }

}