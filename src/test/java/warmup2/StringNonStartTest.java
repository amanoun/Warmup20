package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringNonStartTest {

        StringNonStart stringNonStart = new StringNonStart();
    @Test
    public void nonStartShouldReturnellohere() {
        assertEquals( "ellohere", stringNonStart.nonStart("Hello", "There"));
    }

    @Test
    public void nonStartShouldReturnavaode() {
        assertEquals( "avaode", stringNonStart.nonStart("java", "code"));
    }

    @Test
    public void nonStartShouldReturnAnEmptyString() {
        assertEquals( "", stringNonStart.nonStart("a", "b"));
    }
}