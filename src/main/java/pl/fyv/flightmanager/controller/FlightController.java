package pl.fyv.flightmanager.controller;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.fyv.flightmanager.exceptions.FlightNotFoundException;
import pl.fyv.flightmanager.model.Client;
import pl.fyv.flightmanager.model.Flight;
import pl.fyv.flightmanager.repository.FlightRepo;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController @CrossOrigin(origins = "*")
@RequestMapping("/api/")
public class FlightController {

    private FlightRepo repo;

    @Autowired
    public FlightController(FlightRepo repo) {
        this.repo = repo;
    }


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

    @PostMapping("/flight")
    public Flight createFlight(@Valid @RequestBody Flight flight) {

        System.out.println(flight.getDepartureTime());

        return repo.save(flight);
    }

    @PutMapping("/flight/{id}")
    public ResponseEntity<Flight> updateFlight(@PathVariable(value = "id") Long flightId, @Valid @RequestBody Flight flightUpdatedInfo)
        throws FlightNotFoundException {
        Flight flight = repo.findById(flightId)
                .orElseThrow(FlightNotFoundException::new);

        flight.setDeparturePlace(flightUpdatedInfo.getDeparturePlace());
        flight.setArrivalPlace(flightUpdatedInfo.getArrivalPlace());
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
