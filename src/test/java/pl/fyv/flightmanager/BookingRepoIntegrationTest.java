//package pl.fyv.flightmanager;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.hamcrest.MatcherAssert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.json.JacksonTester;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import pl.fyv.flightmanager.controller.BookingController;
//import pl.fyv.flightmanager.model.Booking;
//import pl.fyv.flightmanager.repository.BookingRepo;
//
//import java.time.LocalDateTime;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.junit.Assert.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.BDDMockito.given;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(MockitoJUnitRunner.class)
//@WebMvcTest(BookingController.class)
//public class BookingRepoIntegrationTest {
//
//    private MockMvc mvc;
//    private JacksonTester<Booking> jsonBooking;
//
//    // https://docs.oracle.com/javase/10/docs/api/java/time/format/DateTimeFormatter.html#ISO_LOCAL_DATE
//
//    private LocalDateTime arrive = LocalDateTime.parse("2020-01-03T12:34:00"); // YYYY-MM-DDTHH-mm-ss
//    private LocalDateTime departure = LocalDateTime.parse("2020-01-11T12:34:00"); // YYYY-MM-DDTHH-mm-ss
//
//    @Mock
//    private BookingRepo repo;
//
//    @InjectMocks
//    BookingController controller;
//
//    @Before
//    public void setUp() {
////        JacksonTester.initFields(this,new ObjectMapper());
////        mvc = MockMvcBuilders.standaloneSetup(controller).build();
//        controller = new BookingController(repo);
//    }
//
//    @Test
//    public void canRetrieveByIdWhenExists() throws Exception {
//        Booking booking = new Booking(1L, 1L, 1L, "done", arrive, departure);
//
//        when(repo.save(booking)).thenReturn(booking);
////        given(repo.findById(1L))
////            .willReturn(java.util.Optional.of(booking));
//
//
////        mvc.perform(
////                MockMvcRequestBuilders.get("/booking/{id}", 1)
//////                MockMvcRequestBuilders.get("/booking/1")
////                        .accept(MediaType.APPLICATION_JSON))
////                .andDo(print())
////                .andExpect(status().isOk())
////                .andExpect(MockMvcResultMatchers.jsonPath("$.bookingId").value(1));
//
//        System.out.println(repo.findAll());
//        System.out.println(controller.getAllBookings());
//
//    }
//}
