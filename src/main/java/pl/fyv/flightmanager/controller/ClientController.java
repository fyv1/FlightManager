package pl.fyv.flightmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.fyv.flightmanager.repository.ClientRepo;

@RestController
@RequestMapping("/api/")
public class ClientController {
    @Autowired
    private ClientRepo repo;

    

}
