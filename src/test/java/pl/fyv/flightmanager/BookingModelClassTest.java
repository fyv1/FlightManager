package pl.fyv.flightmanager;

import org.junit.BeforeClass;
import org.junit.Test;
import pl.fyv.flightmanager.model.Booking;

import static org.junit.Assert.assertEquals;

public class BookingModelClassTest {
    public static Booking booking;

    @BeforeClass
    public static void setUp() {
        booking = new Booking();
    }

    @Test
    public void isSetItemId() {
        booking.setItemId(22);
        assertEquals(22, booking.getItemId());

    }
    }

