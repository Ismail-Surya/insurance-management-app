package in.cyclano.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.cyclano.model.Client;
import in.cyclano.repo.ClientRepository;

@Service
public class ClientService {

	private final ClientRepository clientRepository;

	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	public List <Client> getAllClients () {
		return clientRepository.findAll();
	}
	
}
