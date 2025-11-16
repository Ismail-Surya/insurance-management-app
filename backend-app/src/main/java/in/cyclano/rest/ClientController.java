package in.cyclano.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
