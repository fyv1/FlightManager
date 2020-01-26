package pl.fyv.flightmanager;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.fyv.flightmanager.model.Car;
import pl.fyv.flightmanager.model.Client;

import static org.junit.Assert.assertEquals;

public class CarModelClassTest {
    public static Car car;

    @BeforeClass
    public static void setUp() {
        car = new Car();
    }
    @Test
    public void isSetId_ReturnIdOfCar() {
        car.setId(1);
        assertEquals(1, car.getId());
    }
    @Test
    public void isSetModel_ReturnModelOfCar() {
        car.setModel("Cherokee");
        assertEquals("Cherokee", car.getModel());
    }
    @Test
    public void isSetMileage_ReturnMileage() {
        car.setMileage(20000);
        assertEquals(20000, car.getMileage());
    }
}
