package wycieczka;

import org.junit.Test;

import static org.junit.Assert.*;

public class DomesticTripTest {

    Date start = new Date(2018, 11, 13);
    Date end = new Date(2018, 12, 23);

    @Test
    public void getPrice() {
        Trip trip = new DomesticTrip("Poznan", start, end, 90, 12);
        assertTrue(trip.getPrice() == 78);
    }
}