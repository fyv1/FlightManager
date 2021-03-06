package pl.fyv.flightmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fyv.flightmanager.model.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Long> {
}
