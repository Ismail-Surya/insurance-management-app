package in.cyclano.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cyclano.dto.ApiResponse;
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
	public ResponseEntity <ApiResponse <List <Client>>> getAllClients () {
		List <Client> theClients = clientService.getAllClients();
		ApiResponse <List <Client>> response = new ApiResponse <> ("success", "Clients retrieved successfully", theClients);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <ApiResponse <Client>> getClientById (@PathVariable int id) {
		return clientService.getClientById(id)
				.map(client -> {
					ApiResponse <Client> response = new ApiResponse <> ("success", "Client retrieved successfully", client);
					return ResponseEntity.ok(response);
				})
				.orElseGet(() -> {
					ApiResponse<Client> response =
                            new ApiResponse<>("error", "Client not found with id " + id, null);
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
				});
	}
	
	@PostMapping
	public ResponseEntity <ApiResponse <Client>> createClient (@RequestBody Client client) {
		Client savedClient = clientService.createClient(client);
		ApiResponse <Client> response = new ApiResponse <> ("success", "Client created successfully", savedClient);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity <ApiResponse <Client>> updateClient (
			@PathVariable int id,
			@RequestBody Client client) {
		client.setClientId(id);
		Client updatedClient = clientService.updateClient(client);
		
		ApiResponse <Client> response = new ApiResponse <> ("success", "Client updated successfully", updatedClient);
		return ResponseEntity.ok(response);
	}
	
}
