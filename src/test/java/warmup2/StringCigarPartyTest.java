package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCigarPartyTest {

    StringCigarParty stringCigarParty = new StringCigarParty();

    @Test
    public void cigarPartyShouldReturnFalseWhen30AndWeekendFalse() {
        assertEquals(false, stringCigarParty.cigarParty(30, false));
    }

    @Test
    public void cigarPartyShouldReturnTrueeWhen50AndWeekendFalse() {
        assertEquals(true, stringCigarParty.cigarParty(50, false));
    }

    @Test
    public void cigarPartyShouldReturnTrueWhen70AndWeekendTrue() {
        assertEquals(true, stringCigarParty.cigarParty(70, true));
    }

    @Test
    public void cigarPartyShouldReturnFalseWhen60AndWeekendFalse() {
        assertEquals(true, stringCigarParty.cigarParty(60, true));
    }


    @Test
    public void cigarPartyShouldReturnFalseWhen61AndWeekendFalse() {
        assertEquals(false, stringCigarParty.cigarParty(61, false));
    }
}