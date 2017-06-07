package de.marvin.kuenkler.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(name="name", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin", nullable=false)
	private String name;
	@Column(name="firstname", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin", nullable=false)
	private String firstname;
	@Column(name="idcard_number", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin")
	private String idcardNumber;
	@Column(name="birthday")
	private Date birthday;
	@Column(name="driving_license_number", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin")
	private String drivingLicenseNumber;
	@Column(name="created", nullable=false)
	private Date created = new Date();
	@Column(name="modified", nullable=false)
	private Date modified = new Date();
	
	public Customer() {}
	
	public Customer(String name, String firstname, String idcardNumber, Date birthday, String drivingLicenseNumber) {
		this.name = name;
		this.firstname = firstname;
		this.idcardNumber = idcardNumber;
		this.birthday = birthday;
		this.drivingLicenseNumber = drivingLicenseNumber;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getIdcardNumber() {
		return idcardNumber;
	}
	public void setIdcardNumber(String idcardNumber) {
		this.idcardNumber = idcardNumber;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}
	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Override
	public String toString() {
		return ""
			+ "id: " + id
			+ "name: " + name
			+ "firstName: " + firstname
			+ "idCardNumber: " + idcardNumber
			+ "birthday: " + birthday
			+ "drivingLicenseNumber: " + drivingLicenseNumber
			+ "\ncreated: " + created
			+ "\nmodified: " + modified;
	}
}
