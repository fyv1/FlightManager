package pl.fyv.flightmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fyv.flightmanager.model.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {
}
