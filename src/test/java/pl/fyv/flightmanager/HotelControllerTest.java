package pl.fyv.flightmanager;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pl.fyv.flightmanager.controller.HotelController;
import pl.fyv.flightmanager.model.Hotel;
import pl.fyv.flightmanager.repository.HotelRepo;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class HotelControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private HotelRepo repo;

    @Before
    public void setup() {
        this.mockMvc = standaloneSetup(new HotelController(repo)).build();
    }

    @Test
    public void createHotel() throws Exception {
        Hotel hotel = new Hotel(1L, "Hotel California", "Route 66, LA");

            this.mockMvc.perform(MockMvcRequestBuilders.post("/hotel", hotel)
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().contentType("application/json"));

    }
}
