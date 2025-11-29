package in.cyclano.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cyclano.model.Client;
import in.cyclano.service.ClientService;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

	private final ClientService clientService;

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	
	@GetMapping
	public ResponseEntity <List <Client>> getAllClients () {
		List <Client> theClients = clientService.getAllClients(); 
		return ResponseEntity.ok(theClients);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <Client> getClientById (@PathVariable int id) {
		return clientService.getClientById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity <?> createClient (@RequestBody Client client) {
		try {
			Client savedClient = clientService.createClient(client);
			return ResponseEntity.status(HttpStatus.CREATED).body(savedClient);
		} catch (RuntimeException exc) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Could not create client. Please try again later - " + exc.getMessage());
		}
	}
	
}
