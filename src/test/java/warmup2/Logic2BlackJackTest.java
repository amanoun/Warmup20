package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Logic2BlackJackTest {

    Logic2BlackJack logic2BlackJack = new Logic2BlackJack();

    @Test
    public void blackjackShouldReturnTheNearestValueTo21When19And21ArePassed() {
        assertEquals(21, logic2BlackJack.blackjack(19, 21));
    }

    @Test
    public void blackjackShouldReturnTheNearestValueTo21When21And19ArePassed() {
        assertEquals(21, logic2BlackJack.blackjack(21, 19));
    }

    @Test
    public void blackjackShouldReturnTheNearestValueTo22When19And22ArePassed() {
        assertEquals(19, logic2BlackJack.blackjack(19, 22));
    }

    @Test
    public void blackjackShouldReturnTheNearestValueTo22When22And19ArePassed() {
        assertEquals(19, logic2BlackJack.blackjack(22, 19));
    }

    @Test
    public void blackjackShouldReturnTheNearestValueTo22When18And17ArePassed() {
        assertEquals(18, logic2BlackJack.blackjack(18, 17));
    }

    @Test
    public void blackjackShouldReturn0IfBothAAndBAreOver21() {
        assertEquals(0, logic2BlackJack.blackjack(22, 50));
    }
}