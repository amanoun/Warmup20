package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;


public class LogicSpecialElevenTest {
    LogicSpecialEleven logicSpecialEleven = new LogicSpecialEleven();

    @Test
    public void specialElevenShouldReturnTrueWhen22IsPassed() {
        assertTrue(logicSpecialEleven.specialEleven(22));
    }

    @Test
    public void specialElevenShouldReturnTrueWhen23IsPassed() {
        assertTrue(logicSpecialEleven.specialEleven(23));
    }

    @Test
    public void specialElevenShouldReturnFalseWhen24IsPassed() {
        assertEquals(false, logicSpecialEleven.specialEleven(24));
    }

    @Test
    public void specialElevenShouldReturnTrueWhen11IsPassed() {
        assertEquals(true, logicSpecialEleven.specialEleven(11));
    }

    @Test
    public void specialElevenShouldReturnFalseWhen123IsPassed() {
        assertEquals(false, logicSpecialEleven.specialEleven(123));
    }

    @Test
    public void specialElevenShouldReturnFalseWhen49IsPassed() {
        assertEquals(false, logicSpecialEleven.specialEleven(49));
    }
}