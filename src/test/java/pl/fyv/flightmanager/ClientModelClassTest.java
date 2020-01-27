package pl.fyv.flightmanager;

import org.junit.BeforeClass;
import org.junit.Test;
import pl.fyv.flightmanager.model.Client;
import static org.junit.Assert.assertEquals;

public  class ClientModelClassTest  {

    public static Client client;

    @BeforeClass
    public static void setUp() {
       client = new Client();
    }

    @Test
    public  void isSetFirstName_ReturnFirstName() {
        client.setFirstName("John");
        assertEquals("John", client.getFirstName());
    }
    @Test
    public void isSetLastName_ReturnLastName() {
        client.setLastName("Foster");
        assertEquals("Foster", client.getLastName());
    }

    @Test
    public void isSetId_ReturnId() {
        client.setId(1);
        assertEquals(1, client.getId());
    }
    @Test
    public void isSetSex_ReturnFemale() {
        client.setSex("Female");
        assertEquals("Female", client.getSex());
    }
    @Test
    public void isSetSex_ReturnMale() {
        client.setSex("Male");
        assertEquals("Male", client.getSex());
    }
    @Test
    public void isSetCountry_ReturnNameOfCountry() {
        client.setCountry("England");
        assertEquals("England", client.getCountry());
    }
    @Test
    public void isSetNotes_ReturnNotes() {
        client.setNotes("Notes");
        assertEquals("Notes", client.getNotes());
    }
//    @Test
//    public void isSetBirthdate_ReturnDate() {
//        LocalDate localDate = LocalDate.of(1997,4,26);
//        client.setBirthdate(localDate);
//        assertEquals(localDate, client.getBirthdate());
//    }

//    @Test
//    public void setFlightList_ReturnFlightList() {
//
//        client.setFlightList(List.of());
//        assertEquals("Notes", client.getFlightList());
//    }

}

