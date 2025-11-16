package in.cyclano.repo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.cyclano.model.Client;


@Repository
public class ClientRepository {

	private JdbcTemplate jdbcTemplate;
	
	private final RowMapper <Client> rowMapper = new BeanPropertyRowMapper <> (Client.class);
	
	public ClientRepository (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List <Client> findAll() {
		return jdbcTemplate.query("SELECT * FROM ima_clients", rowMapper);
	}
	
}
