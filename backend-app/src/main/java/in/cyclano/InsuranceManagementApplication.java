package in.cyclano;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.cyclano.repo.ClientRepository;

@SpringBootApplication
public class InsuranceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceManagementApplication.class, args);
	}

}
