package de.marvin.kuenkler.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	@Id
	@Column(name="chassis_number", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin", nullable=false)
	private String chassisNumber;
	@Column(name="brand", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin")
	private String brand;
	@Column(name="model", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin")
	private String model;
	@Column(name="power")
	private Long power;
	@Column(name="name")
	private Long torque;
	@Column(name="gears")
	private String gears;
    @JoinTable(name="license_class", joinColumns=@JoinColumn(name="id"))
	@Column(name="license_class_id", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin", nullable=false)
	private String licenseClassId;
    @JoinTable(name="tire", joinColumns=@JoinColumn(name="id"))
	@Column(name="trie_id")
	private Long trieId;
	@Column(name="current_kilometrage")
	private Long currentKilometrage;
	@Column(name="first_registration")
	private Date firstRegistration;
	@Column(name="created", nullable=false)
	private Date created;
	@Column(name="modified", nullable=false)
	private Date modified;
	
	public Vehicle() {}
	
	public Vehicle(String chassisNumber, String brand, String model, Long power, Long torque, String gears,
			String licenseClassId, Long trieId, Long currentKilometrage, Date firstRegistration) {
		super();
		this.chassisNumber = chassisNumber;
		this.brand = brand;
		this.model = model;
		this.power = power;
		this.torque = torque;
		this.gears = gears;
		this.licenseClassId = licenseClassId;
		this.trieId = trieId;
		this.currentKilometrage = currentKilometrage;
		this.firstRegistration = firstRegistration;
	}
	
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Long getPower() {
		return power;
	}
	public void setPower(Long power) {
		this.power = power;
	}
	public Long getTorque() {
		return torque;
	}
	public void setTorque(Long torque) {
		this.torque = torque;
	}
	public String getGears() {
		return gears;
	}
	public void setGears(String gears) {
		this.gears = gears;
	}
	public String getLicenseClassId() {
		return licenseClassId;
	}
	public void setLicenseClassId(String licenseClassId) {
		this.licenseClassId = licenseClassId;
	}
	public Long getTrieId() {
		return trieId;
	}
	public void setTrieId(Long trieId) {
		this.trieId = trieId;
	}
	public Long getCurrentKilometrage() {
		return currentKilometrage;
	}
	public void setCurrentKilometrage(Long currentKilometrage) {
		this.currentKilometrage = currentKilometrage;
	}
	public Date getFirstRegistration() {
		return firstRegistration;
	}
	public void setFirstRegistration(Date firstRegistration) {
		this.firstRegistration = firstRegistration;
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
}
