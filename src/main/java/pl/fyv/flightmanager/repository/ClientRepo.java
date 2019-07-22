package pl.fyv.flightmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fyv.flightmanager.model.Client;
@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {
}
