package pl.fyv.flightmanager;

import org.joda.time.LocalDateTime;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.fyv.flightmanager.model.Booking;

import static org.junit.Assert.assertEquals;

public class BookingModelClassTest {
    public static Booking booking;
    private LocalDateTime arrive = LocalDateTime.parse("2020-01-03T12:34:00");

    @BeforeClass
    public static void setUp() {
        booking = new Booking();
    }

    @Test
    public void isSetItemId() {
        booking.setItemId(22);
        assertEquals(22, booking.getItemId());
    }
    @Test
    public void isSetClientId() {
        booking.setClientId(8);
        assertEquals(8, booking.getClientId());
    }
    @Test
    public void isSetStatus() {
        booking.setStatus("on");
        assertEquals("on", booking.getStatus());
    }
    @Test
    public void isSetArrive() {
        booking.setArrive(java.time.LocalDateTime.parse("2020-01-02T11:33:55"));
        assertEquals("2020-01-02T11:33:55", booking.getArrive());
    }
    @Test
    public void isSetDeparture() {
        booking.setDeparture(java.time.LocalDateTime.parse("2020-01-03T12:34:00"));
        assertEquals("2020-01-02T11:33:55", booking.getDeparture());
    }
    }

