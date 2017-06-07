package de.marvin.kuenkler.model;

import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name = "driving_licens")
public class DrivingLicense {
	@Id
	@Column(name="driving_license_number", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin", nullable=false)
	private String drivingLicenseNumber;	
	@Column(name="date_of_issue", nullable=false)
	private Date dateOfIssue;
	@Column(name="descrition", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin", nullable=false)
	private String description;
	@Column(name="created", nullable=false)
	private Date created = new Date();
	@Column(name="modified", nullable=false)
	private Date modified = new Date();
	
//    @ElementCollection(fetch = FetchType.EAGER)
//    @JoinTable(name="driving_license_has_license_class", joinColumns=@JoinColumn(name="driving_license_number"))
//    @MapKeyColumn (name="driving_license_number")
//    @Column(name="driving_license_number")
//    private String drivingLicenseNumberId;
//    @Column(name="license_class")
//    private String licenseClassId;
//	
	
    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name="driving_license_has_license_class", joinColumns=@JoinColumn(name="driving_license_number"))
//    @MapKeyColumn (name="driving_license_number")
    @Column(name="VALUE")
    private Map<String, String> parameter;
    @Column(length=1000)
    private String payload;
	
	
	public DrivingLicense() {}
	
	public DrivingLicense(String drivingLicenseNumber, Date dateOfIssue, String description) {
		super();
		this.drivingLicenseNumber = drivingLicenseNumber;
		this.dateOfIssue = dateOfIssue;
		this.description = description;
	}
	
	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}
	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getDescrition() {
		return description;
	}
	public void setDescrition(String descrition) {
		this.description = descrition;
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
				+ "drivingLicenseNumber: " + drivingLicenseNumber
				+ "\ndateOfIssue: " + dateOfIssue
				+ "\ndescription: " + description
				+ "\ncreated: " + created
				+ "\nmodified: " + modified;
	}
}
