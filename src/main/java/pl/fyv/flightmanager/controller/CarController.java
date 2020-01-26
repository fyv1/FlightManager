package pl.fyv.flightmanager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.fyv.flightmanager.exceptions.CarNotFoundException;
import pl.fyv.flightmanager.model.Car;
import pl.fyv.flightmanager.repository.CarRepo;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController @CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CarController {

    private CarRepo repo;

    @Autowired
    public CarController(CarRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/cars")
    public List<Car> getAllCars() { return repo.findAll(); }

    @GetMapping("/car/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable(value = "id") Long carId)
        throws CarNotFoundException {
        Car car = repo.findById(carId)
                .orElseThrow(CarNotFoundException::new);

        return ResponseEntity.ok().body(car);
    }

    @PostMapping("/car")
    public Car createCar(@Valid @RequestBody Car car) {
        return repo.save(car);
    }

    @PutMapping("/car/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable(value = "id") Long carId, @Valid @RequestBody Car carUpdateInfo)
        throws CarNotFoundException {
        Car car = repo.findById(carId)
                .orElseThrow(CarNotFoundException::new);

        car.setModel(carUpdateInfo.getModel());
        car.setMileage(carUpdateInfo.getMileage());

        final Car updatedCar = repo.save(car);

        return ResponseEntity.ok(updatedCar);
    }

    @DeleteMapping("/car/{id}")
    public Map<String, Boolean> deleteCar(@PathVariable(value = "id") Long carId)
        throws CarNotFoundException {
        Car car = repo.findById(carId)
                .orElseThrow(CarNotFoundException::new);

        repo.delete(car);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
