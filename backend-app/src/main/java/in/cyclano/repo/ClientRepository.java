package in.cyclano.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import in.cyclano.model.Client;


@Repository
public class ClientRepository {
	
	private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	private final RowMapper <Client> rowMapper;
	
	public ClientRepository (NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
		this.rowMapper = new BeanPropertyRowMapper<> (Client.class);
	}
	
	public List <Client> findAll() {
		return namedParameterJdbcTemplate.query("SELECT * FROM ima_clients", rowMapper);
	}
	
	public Optional <Client> findById (int clientId) {
		String sql = "SELECT * FROM ima_clients WHERE client_id = :clientId";
		
		MapSqlParameterSource params = new MapSqlParameterSource().addValue("clientId", clientId);
		
		List <Client> theClients = namedParameterJdbcTemplate.query(sql, params, rowMapper);
		return theClients.stream().findFirst();
	}
	
	public Integer save (Client client) {
		String sql = "INSERT INTO ima_clients (client_type, first_name, middle_name, last_name, date_of_birth, legal_business_name, dba_name, business_structure, ein, date_established, id_type, id_number, id_issue_country, id_expiry_date, physical_address_line1, physical_address_line2, physical_city, physical_state, physical_zip_code, physical_country, mailing_same_as_physical, mailing_address_line1, mailing_address_line2, mailing_city, mailing_state, mailing_zip_code, mailing_country, business_description, sic_code, naics_code, annual_gross_revenue, annual_payroll, employees_full_time, employees_part_time, employees_seasonal, ownership_details, primary_contact_name, primary_contact_phone, primary_contact_email, status) VALUES (:clientType, :firstName, :middleName, :lastName, :dateOfBirth, :legalBusinessName, :dbaName, :businessStructure, :ein, :dateEstablished, :idType, :idNumber, :idIssueCountry, :idExpiryDate, :physicalAddressLine1, :physicalAddressLine2, :physicalCity, :physicalState, :physicalZipCode, :physicalCountry, :mailingSameAsPhysical, :mailingAddressLine1, :mailingAddressLine2, :mailingCity, :mailingState, :mailingZipCode, :mailingCountry, :businessDescription, :sicCode, :naicsCode, :annualGrossRevenue, :annualPayroll, :employeesFullTime, :employeesPartTime, :employeesSeasonal, :ownershipDetails, :primaryContactName, :primaryContactPhone, :primaryContactEmail, :status)";
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		namedParameterJdbcTemplate.update(sql, new BeanPropertySqlParameterSource(client), keyHolder, new String [] { "client_id" });
		
		Number key = keyHolder.getKey();
		
		return key != null ? key.intValue() : null;
	}
	
	public int update (Client client) {
		String sql = "UPDATE ima_clients SET client_type = :clientType, first_name = :firstName, middle_name = :middleName, last_name = :lastName, date_of_birth = :dateOfBirth, legal_business_name = :legalBusinessName, dba_name = :dbaName, business_structure = :businessStructure, ein = :ein, date_established = :dateEstablished, id_type = :idType, id_number = :idNumber, id_issue_country = :idIssueCountry, id_expiry_date = :idExpiryDate, physical_address_line1 = :physicalAddressLine1, physical_address_line2 = :physicalAddressLine2, physical_city = :physicalCity, physical_state = :physicalState, physical_zip_code = :physicalZipCode, physical_country = :physicalCountry, mailing_same_as_physical = :mailingSameAsPhysical, mailing_address_line1 = :mailingAddressLine1, mailing_address_line2 = :mailingAddressLine2, mailing_city = :mailingCity, mailing_state = :mailingState, mailing_zip_code = :mailingZipCode, mailing_country = :mailingCountry, business_description = :businessDescription, sic_code = :sicCode, naics_code = :naicsCode, annual_gross_revenue = :annualGrossRevenue, annual_payroll = :annualPayroll, employees_full_time = :employeesFullTime, employees_part_time = :employeesPartTime, employees_seasonal = :employeesSeasonal, ownership_details = :ownershipDetails, primary_contact_name = :primaryContactName, primary_contact_phone = :primaryContactPhone, primary_contact_email = :primaryContactEmail, status = :status WHERE client_id = :clientId";
		
		return namedParameterJdbcTemplate.update(sql, new BeanPropertySqlParameterSource (client));
	}
	
	/* public Client saveAlternate (Client client) {
		String sql = "INSERT INTO ima_clients (client_type, first_name, middle_name, last_name, date_of_birth, legal_business_name, dba_name, business_structure, ein, date_established, id_type, id_number, id_issue_country, id_expiry_date, physical_address_line1, physical_address_line2, physical_city, physical_state, physical_zip_code, physical_country, mailing_same_as_physical, mailing_address_line1, mailing_address_line2, mailing_city, mailing_state, mailing_zip_code, mailing_country, business_description, sic_code, naics_code, annual_gross_revenue, annual_payroll, employees_full_time, employees_part_time, employees_seasonal, ownership_details, primary_contact_name, primary_contact_phone, primary_contact_email, status) VALUES (:client_type, :first_name, :middle_name, :last_name, :date_of_birth, :legal_business_name, :dba_name, :business_structure, :ein, :date_established, :id_type, :id_number, :id_issue_country, :id_expiry_date, :physical_address_line1, :physical_address_line2, :physical_city, :physical_state, :physical_zip_code, :physical_country, :mailing_same_as_physical, :mailing_address_line1, :mailing_address_line2, :mailing_city, :mailing_state, :mailing_zip_code, :mailing_country, :business_description, :sic_code, :naics_code, :annual_gross_revenue, :annual_payroll, :employees_full_time, :employees_part_time, :employees_seasonal, :ownership_details, :primary_contact_name, :primary_contact_phone, :primary_contact_email, :status)";
		
		MapSqlParameterSource params = new MapSqlParameterSource()
				.addValue("client_type", client.getClientType())
				.addValue("first_name", client.getFirstName())
				.addValue("middle_name", client.getMiddleName())
				.addValue("last_name", client.getLastName())
				.addValue("date_of_birth", client.getDateOfBirth())
				.addValue("legal_business_name", client.getLegalBusinessName())
				.addValue("dba_name", client.getDbaName())
				.addValue("business_structure", client.getBusinessStructure())
				.addValue("ein", client.getEin())
				.addValue("date_established", client.getDateEstablished())
				.addValue("id_type", client.getIdType())
				.addValue("id_number", client.getIdNumber())
				.addValue("id_issue_country", client.getIdIssueCountry())
				.addValue("id_expiry_date", client.getIdExpiryDate())
				.addValue("physical_address_line1", client.getPhysicalAddressLine1())
				.addValue("physical_address_line2", client.getPhysicalAddressLine2())
				.addValue("physical_city", client.getPhysicalCity())
				.addValue("physical_state", client.getPhysicalState())
				.addValue("physical_zip_code", client.getPhysicalZipCode())
				.addValue("physical_country", client.getPhysicalCountry())
				.addValue("mailing_same_as_physical", client.getMailingSameAsPhysical())
				.addValue("mailing_address_line1", client.getMailingAddressLine1())
				.addValue("mailing_address_line2", client.getMailingAddressLine2())
				.addValue("mailing_city", client.getMailingCity())
				.addValue("mailing_state", client.getMailingState())
				.addValue("mailing_zip_code", client.getMailingZipCode())
				.addValue("mailing_country", client.getMailingCountry())
				.addValue("business_description", client.getBusinessDescription())
				.addValue("sic_code", client.getSicCode())
				.addValue("naics_code", client.getNaicsCode())
				.addValue("annual_gross_revenue", client.getAnnualGrossRevenue())
				.addValue("annual_payroll", client.getAnnualPayroll())
				.addValue("employees_full_time", client.getEmployeesFullTime())

				.addValue("employees_part_time", client.getEmployeesPartTime())
				.addValue("employees_seasonal", client.getEmployeesSeasonal())
				.addValue("ownership_details", client.getOwnershipDetails())
				.addValue("primary_contact_name", client.getPrimaryContactName())
				.addValue("primary_contact_phone", client.getPrimaryContactPhone())
				.addValue("primary_contact_email", client.getPrimaryContactEmail())
				.addValue("status", client.getStatus());
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		namedParameterJdbcTemplate.update(sql, params, keyHolder, new String [] { "client_id" });
		
		client.setClientId(keyHolder.getKey().intValue());
		
		return client;
	}
	
	public Integer save (Client client) {
		String sql = "INSERT INTO ima_clients (client_type, first_name, middle_name, last_name, date_of_birth, legal_business_name, dba_name, business_structure, ein, date_established, id_type, id_number, id_issue_country, id_expiry_date, physical_address_line1, physical_address_line2, physical_city, physical_state, physical_zip_code, physical_country, mailing_same_as_physical, mailing_address_line1, mailing_address_line2, mailing_city, mailing_state, mailing_zip_code, mailing_country, business_description, sic_code, naics_code, annual_gross_revenue, annual_payroll, employees_full_time, employees_part_time, employees_seasonal, ownership_details, primary_contact_name, primary_contact_phone, primary_contact_email, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";																			
	
		Object[] params = new Object[] {
				client.getClientType(),
				client.getFirstName(),
				client.getMiddleName(),
				client.getLastName(),
				client.getDateOfBirth(),
				client.getLegalBusinessName(),
				client.getDbaName(),
				client.getBusinessStructure(),
				client.getEin(),
				client.getDateEstablished(),
				client.getIdType(),
				client.getIdNumber(),
				client.getIdIssueCountry(),
	            client.getIdExpiryDate(),
	            client.getPhysicalAddressLine1(),
	            client.getPhysicalAddressLine2(),
	            client.getPhysicalCity(),
	            client.getPhysicalState(),
	            client.getPhysicalZipCode(),
	            client.getPhysicalCountry(),
	            client.getMailingSameAsPhysical(),
	            client.getMailingAddressLine1(),
	            client.getMailingAddressLine2(),
	            client.getMailingCity(),
	            client.getMailingState(),
	            client.getMailingZipCode(),
	            client.getMailingCountry(),
	            client.getBusinessDescription(),
	            client.getSicCode(),
	            client.getNaicsCode(),
	            client.getAnnualGrossRevenue(),
	            client.getAnnualPayroll(),
	            client.getEmployeesFullTime(),
	            client.getEmployeesPartTime(),
	            client.getEmployeesSeasonal(),
	            client.getOwnershipDetails(),
	            client.getPrimaryContactName(),
	            client.getPrimaryContactPhone(),
	            client.getPrimaryContactEmail(),
	            client.getStatus()
		};
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(myConn -> {
			PreparedStatement myStmt = myConn.prepareStatement(sql, new String[] { "client_id" });
			for (int i = 0; i < params.length; i++) {
				myStmt.setObject(i + 1, params[i]);
			}
			return myStmt;
		}, keyHolder);
		
		return keyHolder.getKey().intValue();
	
	} */
	
}






