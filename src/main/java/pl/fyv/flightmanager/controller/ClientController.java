package pl.fyv.flightmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.fyv.flightmanager.exceptions.ClientNotFoundException;
import pl.fyv.flightmanager.model.Client;
import pl.fyv.flightmanager.repository.ClientRepo;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/")
public class ClientController {
    @Autowired
    private ClientRepo repo;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return repo.findAll();
    }

    @GetMapping("/client/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable(value = "id") Long clientId)
        throws ClientNotFoundException {
        Client client = repo.findById(clientId)
                .orElseThrow(ClientNotFoundException::new);

        return ResponseEntity.ok().body(client);
    }

    @PostMapping("/client/{id}")
    public Client createClient(@Valid @RequestBody Client client) {
        return repo.save(client);
    }

    @PutMapping("/client/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable(value = "id") Long clientId, @Valid @RequestBody Client clientUpdateInfo)
        throws ClientNotFoundException {
        Client client = repo.findById(clientId)
                .orElseThrow(ClientNotFoundException::new);

        client.setFirstName(clientUpdateInfo.getFirstName());
        client.setLastName(clientUpdateInfo.getLastName());
        client.setSex(clientUpdateInfo.getSex());
        client.setCountry(clientUpdateInfo.getCountry());
        client.setNotes(clientUpdateInfo.getNotes());
        client.setBirthdate(clientUpdateInfo.getBirthdate());

        final Client updatedClient = repo.save(client);

        return ResponseEntity.ok(updatedClient);
    }

    @DeleteMapping("/client/{id}")
    public Map<String, Boolean> deleteClient(@PathVariable(value = "id") Long clientId)
        throws ClientNotFoundException {
        Client client = repo.findById(clientId)
                .orElseThrow(ClientNotFoundException::new);

        repo.delete(client);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }


}
