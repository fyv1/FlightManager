package pl.fyv.flightmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fyv.flightmanager.model.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long> {
}
