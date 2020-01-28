package pl.fyv.flightmanager;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import pl.fyv.flightmanager.model.Booking;
import pl.fyv.flightmanager.repository.BookingRepo;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookingRepoIntegrationTest {

    // https://docs.oracle.com/javase/10/docs/api/java/time/format/DateTimeFormatter.html#ISO_LOCAL_DATE
    private LocalDateTime arrive = LocalDateTime.parse("2020-01-03T12:34:00"); // YYYY-MM-DDTHH-mm-ss
    private LocalDateTime departure = LocalDateTime.parse("2020-01-11T12:34:00"); // YYYY-MM-DDTHH-mm-ss


    @MockBean
    private BookingRepo repo;


    @Test
    public void checkIfRepoSavesObjects() throws Exception {
        Booking booking = new Booking(1L, 1L, 1L, "done", arrive, departure);

        repo.save(booking);

        Assert.assertNotNull(repo);
    }


}
