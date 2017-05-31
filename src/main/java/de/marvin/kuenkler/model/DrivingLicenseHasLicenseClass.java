//package de.marvin.kuenkler.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "driving_license_has_license_class")
//public class DrivingLicenseHasLicenseClass {
//	@Column(name="driving_license_number", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin", nullable=false)
//	private String drivingLicenseNumber;
//    @JoinTable(name="license_class", joinColumns=@JoinColumn(name="id"))
//	@Column(name="license_class_id", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin", nullable=false)
//	private String licenseClassId;
//	
//    public DrivingLicenseHasLicenseClass() {}
//    
//    public DrivingLicenseHasLicenseClass(String drivingLicenseNumber, String licenseClassId) {
//		super();
//		this.drivingLicenseNumber = drivingLicenseNumber;
//		this.licenseClassId = licenseClassId;
//	}
//	
//    public String getDrivingLicenseNumber() {
//		return drivingLicenseNumber;
//	}
//	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
//		this.drivingLicenseNumber = drivingLicenseNumber;
//	}
//	public String getLicenseClassId() {
//		return licenseClassId;
//	}
//	public void setLicenseClassId(String licenseClassId) {
//		this.licenseClassId = licenseClassId;
//	}
//}
