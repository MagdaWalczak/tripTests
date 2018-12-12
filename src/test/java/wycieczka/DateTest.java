package wycieczka;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {



    @Test
    public void shouldCheckDate() {
        assertTrue(Date.of("2018-12-05", "-").equals(new Date(2018, 12, 05)));
    }
}