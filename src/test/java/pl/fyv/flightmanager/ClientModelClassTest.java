package pl.fyv.flightmanager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.fyv.flightmanager.model.Client;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ClientModelClassTest  {

    public static Client client;

    @BeforeClass
    public static void setUp() {
       client = new Client();
    }

    @Test
    public void isSetFirstNameWorking() {
        client.setFirstName("John");
        assertEquals("John", client.getFirstName());
    }

}
