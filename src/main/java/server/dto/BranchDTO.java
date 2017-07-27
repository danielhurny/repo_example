package server.dto;

public class BranchDTO {

	private int id;
	
	private String manager;
	
	private String branchName;
	
	private int numOfEmpl;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String brangName) {
		this.branchName = brangName;
	}

	public int getNumOfEmpl() {
		return numOfEmpl;
	}

	public void setNumOfEmpl(int numOfEmpl) {
		this.numOfEmpl = numOfEmpl;
	}
	
	
}
