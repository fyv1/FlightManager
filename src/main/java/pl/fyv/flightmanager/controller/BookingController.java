package pl.fyv.flightmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.fyv.flightmanager.exceptions.BookingNotFoundException;
import pl.fyv.flightmanager.model.Booking;
import pl.fyv.flightmanager.repository.BookingRepo;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController @CrossOrigin(origins = "*")
@RequestMapping("/api/")
public class BookingController {

    private BookingRepo repo;
    
    @Autowired
    public BookingController(BookingRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/bookings")
    public List<Booking> getAllBookings() {
        return repo.findAll();
    }

    @GetMapping("/booking/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable(value = "id") Long bookingId)
            throws BookingNotFoundException {
        Booking booking = repo.findById(bookingId)
                .orElseThrow(BookingNotFoundException::new);

        return ResponseEntity.ok().body(booking);
    }

    @PostMapping("/booking")
    public Booking createBooking(@Valid @RequestBody Booking booking) {
        return repo.save(booking);
    }

    @PutMapping("/booking/{id}")
    public ResponseEntity<Booking> updateBooking(@PathVariable(value = "id") Long bookingId, @Valid @RequestBody Booking bookingUpdateInfo)
            throws BookingNotFoundException {
        Booking booking = repo.findById(bookingId)
                .orElseThrow(BookingNotFoundException::new);

        booking.setItemId(bookingUpdateInfo.getItemId());
        booking.setClientId(bookingUpdateInfo.getClientId());
        booking.setStatus(bookingUpdateInfo.getStatus());
        booking.setArrive(bookingUpdateInfo.getArrive());
        booking.setDeparture(bookingUpdateInfo.getDeparture());

        final Booking updatedBooking = repo.save(booking);

        return ResponseEntity.ok(updatedBooking);
    }

    @DeleteMapping("/booking/{id}")
    public Map<String, Boolean> deleteBooking(@PathVariable(value = "id") Long bookingId)
            throws BookingNotFoundException {
        Booking booking = repo.findById(bookingId)
                .orElseThrow(BookingNotFoundException::new);

        repo.delete(booking);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
