package server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Branch implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "branchName", unique = true)
	private String branchName;
	
	@Column(name = "manager")
	private String manager;
	
	@Column (name="numOfEmpl")
	private int numOfEmpl;

	public Branch() {
		super();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}


	public int getNumOfEmpl() {
		return numOfEmpl;
	}


	public void setNumOfEmpl(int numOfEmpl) {
		this.numOfEmpl = numOfEmpl;
	}
	
	
	

}
