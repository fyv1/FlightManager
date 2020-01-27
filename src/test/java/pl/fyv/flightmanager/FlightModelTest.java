package pl.fyv.flightmanager;

import org.junit.BeforeClass;
import org.junit.Test;
import pl.fyv.flightmanager.model.Flight;

import static org.junit.Assert.assertEquals;

public class FlightModelTest {
    public static Flight flight;

    @BeforeClass
    public static void setUp() {
        flight = new Flight();
    }

    @Test

        public void isSetDeparturePlace() {
            flight.setDeparturePlace("London");
        assertEquals("London", flight.getDeparturePlace());
    }
    }

