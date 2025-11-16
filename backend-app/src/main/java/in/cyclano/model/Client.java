package in.cyclano.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class Client {

	private Integer clientId;
	private String clientType;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dateOfBirth;
	private String legalBusinessName;
	private String dbaName;
	private String businessStructure;
	private String ein;
	private Date dateEstablished;
	private Integer yearsInBusiness;
	
	private String idType;
	private String idNumber;
	
	private String idIssueCountry;
	private Date idExpiryDate;
	
	private String physicalAddressLine1;
	private String physicalAddressLine2;
	private String physicalCity;
	private String physicalState;
	private String physicalZipCode;
	private String physicalCountry;
	
	private Boolean mailingSameAsPhysical;
	private String mailingAddressLine1;
	private String mailingAddressLine2;
	private String mailingCity;
	private String mailingState;
	private String mailingZipCode;
	private String mailingCountry;
	
	private String businessDescription;
	private String sicCode;
	private String naicsCode;
	private BigDecimal annualGrossRevenue;
	private BigDecimal annualPayroll;
	
	private Integer employeesFullTime;
	private Integer employeesPartTime;
	private Integer employeesSeasonal;
	
	private String ownershipDetails;
	
	private String primaryContactName;
	private String primaryContactPhone;
	private String primaryContactEmail;
	
	private Timestamp applicationDate;
	private String status;
	
	public Client() {
	}

	public Client(Integer clientId, String clientType, String firstName, String middleName, String lastName,
			Date dateOfBirth, String legalBusinessName, String dbaName, String businessStructure, String ein,
			Date dateEstablished, Integer yearsInBusiness, String idType, String idNumber, String idIssueCountry,
			Date idExpiryDate, String physicalAddressLine1, String physicalAddressLine2, String physicalCity,
			String physicalState, String physicalZipCode, String physicalCountry, Boolean mailingSameAsPhysical,
			String mailingAddressLine1, String mailingAddressLine2, String mailingCity, String mailingState,
			String mailingZipCode, String mailingCountry, String businessDescription, String sicCode, String naicsCode,
			BigDecimal annualGrossRevenue, BigDecimal annualPayroll, Integer employeesFullTime,
			Integer employeesPartTime, Integer employeesSeasonal, String ownershipDetails, String primaryContactName,
			String primaryContactPhone, String primaryContactEmail, Timestamp applicationDate, String status) {
		this.clientId = clientId;
		this.clientType = clientType;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.legalBusinessName = legalBusinessName;
		this.dbaName = dbaName;
		this.businessStructure = businessStructure;
		this.ein = ein;
		this.dateEstablished = dateEstablished;
		this.yearsInBusiness = yearsInBusiness;
		this.idType = idType;
		this.idNumber = idNumber;
		this.idIssueCountry = idIssueCountry;
		this.idExpiryDate = idExpiryDate;
		this.physicalAddressLine1 = physicalAddressLine1;
		this.physicalAddressLine2 = physicalAddressLine2;
		this.physicalCity = physicalCity;
		this.physicalState = physicalState;
		this.physicalZipCode = physicalZipCode;
		this.physicalCountry = physicalCountry;
		this.mailingSameAsPhysical = mailingSameAsPhysical;
		this.mailingAddressLine1 = mailingAddressLine1;
		this.mailingAddressLine2 = mailingAddressLine2;
		this.mailingCity = mailingCity;
		this.mailingState = mailingState;
		this.mailingZipCode = mailingZipCode;
		this.mailingCountry = mailingCountry;
		this.businessDescription = businessDescription;
		this.sicCode = sicCode;
		this.naicsCode = naicsCode;
		this.annualGrossRevenue = annualGrossRevenue;
		this.annualPayroll = annualPayroll;
		this.employeesFullTime = employeesFullTime;
		this.employeesPartTime = employeesPartTime;
		this.employeesSeasonal = employeesSeasonal;
		this.ownershipDetails = ownershipDetails;
		this.primaryContactName = primaryContactName;
		this.primaryContactPhone = primaryContactPhone;
		this.primaryContactEmail = primaryContactEmail;
		this.applicationDate = applicationDate;
		this.status = status;
	}

	public Integer getClientId() {
		return clientId;
	}



	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}



	public String getClientType() {
		return clientType;
	}



	public void setClientType(String clientType) {
		this.clientType = clientType;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getMiddleName() {
		return middleName;
	}



	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Date getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getLegalBusinessName() {
		return legalBusinessName;
	}



	public void setLegalBusinessName(String legalBusinessName) {
		this.legalBusinessName = legalBusinessName;
	}



	public String getDbaName() {
		return dbaName;
	}



	public void setDbaName(String dbaName) {
		this.dbaName = dbaName;
	}



	public String getBusinessStructure() {
		return businessStructure;
	}



	public void setBusinessStructure(String businessStructure) {
		this.businessStructure = businessStructure;
	}



	public String getEin() {
		return ein;
	}



	public void setEin(String ein) {
		this.ein = ein;
	}



	public Date getDateEstablished() {
		return dateEstablished;
	}



	public void setDateEstablished(Date dateEstablished) {
		this.dateEstablished = dateEstablished;
	}



	public Integer getYearsInBusiness() {
		return yearsInBusiness;
	}



	public void setYearsInBusiness(Integer yearsInBusiness) {
		this.yearsInBusiness = yearsInBusiness;
	}



	public String getIdType() {
		return idType;
	}



	public void setIdType(String idType) {
		this.idType = idType;
	}



	public String getIdNumber() {
		return idNumber;
	}



	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}



	public String getIdIssueCountry() {
		return idIssueCountry;
	}



	public void setIdIssueCountry(String idIssueCountry) {
		this.idIssueCountry = idIssueCountry;
	}



	public Date getIdExpiryDate() {
		return idExpiryDate;
	}



	public void setIdExpiryDate(Date idExpiryDate) {
		this.idExpiryDate = idExpiryDate;
	}



	public String getPhysicalAddressLine1() {
		return physicalAddressLine1;
	}



	public void setPhysicalAddressLine1(String physicalAddressLine1) {
		this.physicalAddressLine1 = physicalAddressLine1;
	}



	public String getPhysicalAddressLine2() {
		return physicalAddressLine2;
	}



	public void setPhysicalAddressLine2(String physicalAddressLine2) {
		this.physicalAddressLine2 = physicalAddressLine2;
	}



	public String getPhysicalCity() {
		return physicalCity;
	}



	public void setPhysicalCity(String physicalCity) {
		this.physicalCity = physicalCity;
	}



	public String getPhysicalState() {
		return physicalState;
	}



	public void setPhysicalState(String physicalState) {
		this.physicalState = physicalState;
	}



	public String getPhysicalZipCode() {
		return physicalZipCode;
	}



	public void setPhysicalZipCode(String physicalZipCode) {
		this.physicalZipCode = physicalZipCode;
	}



	public String getPhysicalCountry() {
		return physicalCountry;
	}



	public void setPhysicalCountry(String physicalCountry) {
		this.physicalCountry = physicalCountry;
	}



	public Boolean getMailingSameAsPhysical() {
		return mailingSameAsPhysical;
	}



	public void setMailingSameAsPhysical(Boolean mailingSameAsPhysical) {
		this.mailingSameAsPhysical = mailingSameAsPhysical;
	}



	public String getMailingAddressLine1() {
		return mailingAddressLine1;
	}



	public void setMailingAddressLine1(String mailingAddressLine1) {
		this.mailingAddressLine1 = mailingAddressLine1;
	}



	public String getMailingAddressLine2() {
		return mailingAddressLine2;
	}



	public void setMailingAddressLine2(String mailingAddressLine2) {
		this.mailingAddressLine2 = mailingAddressLine2;
	}



	public String getMailingCity() {
		return mailingCity;
	}



	public void setMailingCity(String mailingCity) {
		this.mailingCity = mailingCity;
	}



	public String getMailingState() {
		return mailingState;
	}



	public void setMailingState(String mailingState) {
		this.mailingState = mailingState;
	}



	public String getMailingZipCode() {
		return mailingZipCode;
	}



	public void setMailingZipCode(String mailingZipCode) {
		this.mailingZipCode = mailingZipCode;
	}



	public String getMailingCountry() {
		return mailingCountry;
	}



	public void setMailingCountry(String mailingCountry) {
		this.mailingCountry = mailingCountry;
	}



	public String getBusinessDescription() {
		return businessDescription;
	}



	public void setBusinessDescription(String businessDescription) {
		this.businessDescription = businessDescription;
	}



	public String getSicCode() {
		return sicCode;
	}



	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}



	public String getNaicsCode() {
		return naicsCode;
	}



	public void setNaicsCode(String naicsCode) {
		this.naicsCode = naicsCode;
	}



	public BigDecimal getAnnualGrossRevenue() {
		return annualGrossRevenue;
	}



	public void setAnnualGrossRevenue(BigDecimal annualGrossRevenue) {
		this.annualGrossRevenue = annualGrossRevenue;
	}



	public BigDecimal getAnnualPayroll() {
		return annualPayroll;
	}



	public void setAnnualPayroll(BigDecimal annualPayroll) {
		this.annualPayroll = annualPayroll;
	}



	public Integer getEmployeesFullTime() {
		return employeesFullTime;
	}



	public void setEmployeesFullTime(Integer employeesFullTime) {
		this.employeesFullTime = employeesFullTime;
	}



	public Integer getEmployeesPartTime() {
		return employeesPartTime;
	}



	public void setEmployeesPartTime(Integer employeesPartTime) {
		this.employeesPartTime = employeesPartTime;
	}



	public Integer getEmployeesSeasonal() {
		return employeesSeasonal;
	}



	public void setEmployeesSeasonal(Integer employeesSeasonal) {
		this.employeesSeasonal = employeesSeasonal;
	}



	public String getOwnershipDetails() {
		return ownershipDetails;
	}



	public void setOwnershipDetails(String ownershipDetails) {
		this.ownershipDetails = ownershipDetails;
	}



	public String getPrimaryContactName() {
		return primaryContactName;
	}



	public void setPrimaryContactName(String primaryContactName) {
		this.primaryContactName = primaryContactName;
	}



	public String getPrimaryContactPhone() {
		return primaryContactPhone;
	}



	public void setPrimaryContactPhone(String primaryContactPhone) {
		this.primaryContactPhone = primaryContactPhone;
	}



	public String getPrimaryContactEmail() {
		return primaryContactEmail;
	}



	public void setPrimaryContactEmail(String primaryContactEmail) {
		this.primaryContactEmail = primaryContactEmail;
	}



	public Timestamp getApplicationDate() {
		return applicationDate;
	}



	public void setApplicationDate(Timestamp applicationDate) {
		this.applicationDate = applicationDate;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientType=" + clientType + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", legalBusinessName=" + legalBusinessName + ", dbaName=" + dbaName + ", businessStructure="
				+ businessStructure + ", ein=" + ein + ", dateEstablished=" + dateEstablished + ", yearsInBusiness="
				+ yearsInBusiness + ", idType=" + idType + ", idNumber=" + idNumber + ", idIssueCountry="
				+ idIssueCountry + ", idExpiryDate=" + idExpiryDate + ", physicalAddressLine1=" + physicalAddressLine1
				+ ", physicalAddressLine2=" + physicalAddressLine2 + ", physicalCity=" + physicalCity
				+ ", physicalState=" + physicalState + ", physicalZipCode=" + physicalZipCode + ", physicalCountry="
				+ physicalCountry + ", mailingSameAsPhysical=" + mailingSameAsPhysical + ", mailingAddressLine1="
				+ mailingAddressLine1 + ", mailingAddressLine2=" + mailingAddressLine2 + ", mailingCity=" + mailingCity
				+ ", mailingState=" + mailingState + ", mailingZipCode=" + mailingZipCode + ", mailingCountry="
				+ mailingCountry + ", businessDescription=" + businessDescription + ", sicCode=" + sicCode
				+ ", naicsCode=" + naicsCode + ", annualGrossRevenue=" + annualGrossRevenue + ", annualPayroll="
				+ annualPayroll + ", employeesFullTime=" + employeesFullTime + ", employeesPartTime="
				+ employeesPartTime + ", employeesSeasonal=" + employeesSeasonal + ", ownershipDetails="
				+ ownershipDetails + ", primaryContactName=" + primaryContactName + ", primaryContactPhone="
				+ primaryContactPhone + ", primaryContactEmail=" + primaryContactEmail + ", applicationDate="
				+ applicationDate + ", status=" + status + "]";
	}
	
}
