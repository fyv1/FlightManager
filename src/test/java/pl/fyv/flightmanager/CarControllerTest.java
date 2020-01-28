package pl.fyv.flightmanager;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pl.fyv.flightmanager.controller.CarController;
import pl.fyv.flightmanager.repository.CarRepo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class CarControllerTets {

    private MockMvc mockMvc;

    @InjectMocks
    private CarRepo repo;

    @Before
    public void setup() {
        this.mockMvc = standaloneSetup(new CarController(repo)).build();
    }

    @Test
    public void getCarListFromMock_ExpectEmpty() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/cars")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isNotFound());
//                .andExpect((ResultMatcher) content().contentType("application/json"));

    }
}
