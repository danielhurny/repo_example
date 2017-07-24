package server.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import server.Colour;
import server.converter.ColourToLowerCaseConverter;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

	@Id
	@GeneratedValue
	private int id;

	@Column(unique = true)
	private String name;

	private String passwd;

	private String comment;

	private String address;

	private Date birthDate;

	private Integer companyId;

	// @Enumerated(EnumType.STRING)
	@Column
	@Convert(converter = ColourToLowerCaseConverter.class)
	private Colour favouriteColour;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String passwd, String comment, String address) {
		super();
		this.id = id;
		this.name = name;
		this.passwd = passwd;
		this.comment = comment;
		this.address = address;
	}

	public Employee(String name, String passwd, String comment, String address) {
		super();
		this.name = name;
		this.passwd = passwd;
		this.comment = comment;
		this.address = address;
	}

	public Employee(String name, String passwd, String comment, String address, Date birthDate, Colour favouriteColour,
			Integer companyId) {
		super();

		this.name = name;
		this.passwd = passwd;
		this.comment = comment;
		this.address = address;
		this.birthDate = birthDate;
		this.favouriteColour = favouriteColour;
		this.companyId = companyId;
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

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Colour getFavouriteColour() {
		return favouriteColour;
	}

	public void setFavouriteColour(Colour favouriteColour) {
		this.favouriteColour = favouriteColour;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
