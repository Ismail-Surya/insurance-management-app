package in.cyclano.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.cyclano.model.Client;
import in.cyclano.repo.ClientRepository;

@Service
public class ClientService {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientService.class);

	private final ClientRepository clientRepository;

	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	public List <Client> getAllClients () {
		return clientRepository.findAll();
	}
	
	public Optional <Client> getClientById(int clientId) {
		return clientRepository.findById(clientId);
	}
	
	@Transactional
    public Client createClient(Client client) {
        try {
            Integer id = clientRepository.save(client);
            if (id != null) {
                client.setClientId(id);
            } else {
                logger.warn("Client was saved but no ID was returned");
            }
            return client;
        } catch (DataAccessException exc) {
        	logger.error("Error saving client: {} " + exc.getMessage(), exc);
            throw new RuntimeException("Could not save client", exc);
        }
    }
	
	@Transactional
	public Client updateClient (Client client) {
		try {
			int rows = clientRepository.update(client);
			
			if (rows == 0) {
				throw new RuntimeException ("No client found with id " + client.getClientId());
			}
			return client;
		} catch (DataAccessException exc) {
			logger.error("Error updating client: {} " + exc.getMessage(), exc);
            throw new RuntimeException("Could not update client", exc);
		}
	}
	
}
