package pl.fyv.flightmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.fyv.flightmanager.exceptions.FlightNotFoundException;
import pl.fyv.flightmanager.model.Flight;
import pl.fyv.flightmanager.repository.FlightRepo;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/")
public class FlightController {
    @Autowired
    private FlightRepo repo;

    @GetMapping("/flights")
    public List<Flight> getAllFlights() {
        return repo.findAll();
    }

    @GetMapping("/flight/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable(value = "id") Long flightId)
        throws FlightNotFoundException {
        Flight flight = repo.findById(flightId)
                .orElseThrow(FlightNotFoundException::new);

        return ResponseEntity.ok().body(flight);
    }

    @PostMapping("/flight/{id}")
    public Flight createFlight(@Valid @RequestBody Flight flight) {
        return repo.save(flight);
    }

    @PutMapping("/flight/{id}")
    public ResponseEntity<Flight> updateFlight(@PathVariable(value = "id") Long flightId, @Valid @RequestBody Flight flightUpdatedInfo)
        throws FlightNotFoundException {
        Flight flight = repo.findById(flightId)
                .orElseThrow(FlightNotFoundException::new);

        flight.setDepartureTime(flightUpdatedInfo.getDepartureTime());
        flight.setArrivalTime(flightUpdatedInfo.getArrivalTime());
        flight.setFreeSeats(flightUpdatedInfo.getFreeSeats());
        flight.setClientList(flightUpdatedInfo.getClientList());
        flight.setPrice(flightUpdatedInfo.getPrice());

        final Flight updatedFlight = repo.save(flight);
        return ResponseEntity.ok(updatedFlight);
    }

    @DeleteMapping("/flight/{id}")
    public Map<String, Boolean> deleteFlight(@PathVariable(value = "id") Long flightId)
        throws FlightNotFoundException {
        Flight flight = repo.findById(flightId)
                .orElseThrow(FlightNotFoundException::new);

        repo.delete(flight);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
