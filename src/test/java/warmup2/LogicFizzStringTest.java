package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicFizzStringTest {
    LogicFizzString logicFizzString = new LogicFizzString();

    @Test
    public void fizzStringShouldReturnFizzWhenFigIsPassed() {
        assertEquals("Fizz", logicFizzString.fizzString("fig"));
    }

    @Test
    public void fizzStringShouldReturnBuzzWhenDibIsPassed() {
        assertEquals("Buzz", logicFizzString.fizzString("dib"));
    }

    @Test
    public void fizzStringShouldReturnFizzBuzzWhenFibIsPassed() {
        assertEquals("FizzBuzz", logicFizzString.fizzString("fib"));
    }

    @Test
    public void fizzStringShouldReturnFizzBuzzWhenFbIsPassed() {
        assertEquals("FizzBuzz", logicFizzString.fizzString("fb"));
    }

    @Test
    public void fizzStringShouldReturnBoooWhenBoooIsPassed() {
        assertEquals("booo", logicFizzString.fizzString("booo"));
    }
}