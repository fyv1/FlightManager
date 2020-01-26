package pl.fyv.flightmanager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import pl.fyv.flightmanager.model.Booking;
import pl.fyv.flightmanager.repository.BookingRepo;

@RunWith(SpringRunner.class)
@DataJdbcTest
public class BookingRepoIntegrationTest {

//    @MockBean
//    private BookingRepo repo;
//
//    @Before
//    public void setUp() {
//        Booking booking = new Booking();
//        Mockito.when(repo.findById(1L)).thenReturn(java.util.Optional.of(booking));
//    }
//    @Test
//    public void test() {
//
//    }

}
