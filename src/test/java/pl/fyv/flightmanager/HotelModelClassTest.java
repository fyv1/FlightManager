package pl.fyv.flightmanager;

import org.junit.BeforeClass;
import org.junit.Test;
import pl.fyv.flightmanager.model.Hotel;

import static org.junit.Assert.assertEquals;

public class HotelModelClassTest {
    public static Hotel hotel;

    @BeforeClass
    public static void setUp(){
         hotel = new Hotel();
    }
    @Test
    public void isSetId_ReturnId() {
        hotel.setId(1);
        assertEquals(1, hotel.getId());
    }
    @Test
    public void isSetName_ReturnNameOfHotel() {
        hotel.setName("Drazica");
        assertEquals("Drazica", hotel.getName());
    }
    @Test
    public void isSetAddress_ReturnAddress() {
        hotel.setAddress("ul. Ružmarinska 6, 51500 Krk");
        assertEquals("ul. Ružmarinska 6, 51500 Krk", hotel.getAddress());
    }
}
