package server.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class EmployeeDTO {

	private String name;
	private String address;
	private String comment;

	public EmployeeDTO(String name, String address, String comment) {
		super();
		this.name = name;
		this.address = address;
		this.comment = comment;
	}

	public EmployeeDTO() {
		super();
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
