package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AltFlightsTest {
    @Test
    public void shouldReturnKien() {
        AltFlights altFlights = new AltFlights();
        assertEquals("kien", altFlights.altPairs("kitten"));
    }

    @Test
    public void shouldReturnChole() {
        AltFlights altFlights = new AltFlights();
        assertEquals("chole", altFlights.altPairs("chocolate"));
    }

    @Test
    public void shouldReturnCongrr() {
        AltFlights altFlights = new AltFlights();
        assertEquals("Congrr", altFlights.altPairs("CodingHorror"));
    }
}