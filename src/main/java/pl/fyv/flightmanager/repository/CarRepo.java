package pl.fyv.flightmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fyv.flightmanager.model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Long> {
}
