package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicCigarPartyTest {

    LogicCigarParty logicCigarParty = new LogicCigarParty();

    @Test
    public void cigarPartyShouldReturnFalseWhen30AndWeekendFalse() {
        assertEquals(false, logicCigarParty.cigarParty(30, false));
    }

    @Test
    public void cigarPartyShouldReturnTrueeWhen50AndWeekendFalse() {
        assertEquals(true, logicCigarParty.cigarParty(50, false));
    }

    @Test
    public void cigarPartyShouldReturnTrueWhen70AndWeekendTrue() {
        assertEquals(true, logicCigarParty.cigarParty(70, true));
    }

    @Test
    public void cigarPartyShouldReturnFalseWhen60AndWeekendFalse() {
        assertEquals(true, logicCigarParty.cigarParty(60, true));
    }


    @Test
    public void cigarPartyShouldReturnFalseWhen61AndWeekendFalse() {
        assertEquals(false, logicCigarParty.cigarParty(61, false));
    }
}