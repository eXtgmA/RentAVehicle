package de.marvin.kuenkler.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "license_class")
public class LicenseClass {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(name="class", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin", nullable=false)
	private String classType;
	@Column(name="created", nullable=false)
	private Date created = new Date();
	@Column(name="modified", nullable=false)
	private Date modified = new Date();
	
	public LicenseClass() {}
	
	public LicenseClass(String classType) {
		super();
		this.classType = classType;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
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
			+ "\nclass: " + classType
			+ "\ncreated: " + created
			+ "\nmodified: " + modified;
	}
}
