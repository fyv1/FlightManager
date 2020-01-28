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
    public void isFreeSeats() {
        flight.setFreeSeats(58);
        assertEquals(58, flight.getFreeSeats());
    }

//    @Test
//    public void isPrice() {
//        flight.setPrice(139.99d);
//        assertEquals(139.99d, flight.getPrice());
//    }
}

