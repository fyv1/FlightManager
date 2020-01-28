package pl.fyv.flightmanager;

import org.joda.time.LocalDateTime;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.fyv.flightmanager.model.Flight;

import static org.junit.Assert.assertEquals;
import static pl.fyv.flightmanager.BookingModelClassTest.booking;

public class FlightModelTest {
    public static Flight flight;
    private LocalDateTime arrive = LocalDateTime.parse("2020-01-03T12:34:00");

    @BeforeClass
    public static void setUp() {
        flight = new Flight();
    }

    @Test
    public void isSetDeparturePlace() {
        flight.setDeparturePlace("London");
        assertEquals("London", flight.getDeparturePlace());
    }

    @Test
    public void isSetArrivalPlace() {
        flight.setArrivalPlace("Madrid");
        assertEquals("Madrid", flight.getArrivalPlace());
    }

    @Test
    public void isSetArrivalTime() {
        booking.setArrive(java.time.LocalDateTime.parse("2020-01-02T11:33:55"));
        assertEquals("2020-01-02T11:33:55", booking.getArrive());
    }

    @Test
    public void isSetDepartureTime() {
        booking.setDeparture(java.time.LocalDateTime.parse("2020-01-03T12:34:00"));
        assertEquals("2020-01-02T11:33:55", booking.getDeparture());
    }

    @Test
    public void isFreeSeats() {
        flight.setArrivalPlace("58B");
        assertEquals("58B", flight.getFreeSeats());
    }

  /*  @Test
    public void isPrice() {
        flight.setPrice(139.99);
        assertEquals(139.99, flight.getPrice());
    }  */
}

