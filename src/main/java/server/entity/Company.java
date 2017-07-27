package server.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Company implements Serializable {

	@Id
	@GeneratedValue
	private int id;

	@Column (name = "name")
	private String name;

	private String address;

	private int numberOfDepartments;

	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="companyId")
	private List<Employee> employees;

	public Company() {
		super();
	}

	public Company(int id, String name, String address, int numberOfDepartments, List<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.numberOfDepartments = numberOfDepartments;
		this.employees = employees;
	}

	public Company(String name, String address, int numberOfDepartments, List<Employee> employees) {
		super();
		this.name = name;
		this.address = address;
		this.numberOfDepartments = numberOfDepartments;
		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
