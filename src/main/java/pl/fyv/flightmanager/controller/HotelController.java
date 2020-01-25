package pl.fyv.flightmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.fyv.flightmanager.exceptions.HotelNotFoundException;
import pl.fyv.flightmanager.model.Hotel;
import pl.fyv.flightmanager.repository.HotelRepo;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController @CrossOrigin(origins = "*")
@RequestMapping("/api/")
public class HotelController {
    
    private HotelRepo repo;
    
    @Autowired
    public HotelController(HotelRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/hotels")
    public List<Hotel> getAllHotels() {
        return repo.findAll();
    }

    @GetMapping("/hotel/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable(value = "id") Long hotelId)
            throws HotelNotFoundException {
        Hotel hotel = repo.findById(hotelId)
                .orElseThrow(HotelNotFoundException::new);

        return ResponseEntity.ok().body(hotel);
    }

    @PostMapping("/hotel")
    public Hotel createHotel(@Valid @RequestBody Hotel hotel) {
        return repo.save(hotel);
    }

    @PutMapping("/hotel/{id}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable(value = "id") Long hotelId, @Valid @RequestBody Hotel hotelUpdateInfo)
            throws HotelNotFoundException {
        Hotel hotel = repo.findById(hotelId)
                .orElseThrow(HotelNotFoundException::new);

        hotel.setName(hotelUpdateInfo.getName());
        hotel.setAddress(hotelUpdateInfo.getAddress());

        final Hotel updatedhotel = repo.save(hotel);

        return ResponseEntity.ok(updatedhotel);
    }

    @DeleteMapping("/hotel/{id}")
    public Map<String, Boolean> deleteHotel(@PathVariable(value = "id") Long hotelId)
            throws HotelNotFoundException {
        Hotel hotel = repo.findById(hotelId)
                .orElseThrow(HotelNotFoundException::new);

        repo.delete(hotel);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }


}
