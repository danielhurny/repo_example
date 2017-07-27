package server.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyDTO {
	
	@JsonProperty("company_name")
	private String name;
	
	private String address;
	
	private int numberOfDepartments;

	private List<EmployeeDTO> employees;
	
	

	public CompanyDTO() {
		super();
	}

	public CompanyDTO(String name, String address, int numberOfDepartments, List<EmployeeDTO> employees) {
		super();
		this.name = name;
		this.address = address;
		this.numberOfDepartments = numberOfDepartments;
		this.employees = employees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfDepartments() {
		return numberOfDepartments;
	}

	public void setNumberOfDepartments(int numberOfDepartments) {
		this.numberOfDepartments = numberOfDepartments;
	}

	public List<EmployeeDTO> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeDTO> employees) {
		this.employees = employees;
	}
	
	

}
