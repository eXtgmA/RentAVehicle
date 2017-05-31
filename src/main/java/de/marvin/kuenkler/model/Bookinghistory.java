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
@Table(name = "bookinghistory")
public class Bookinghistory {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(name="chassis_number", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin", nullable=false)
    private String chassisNumber;
    @JoinTable(name="customer", joinColumns=@JoinColumn(name="ID"))
	@Column(name="customer_id", nullable=false)
    private Long customerId;
	@Column(name="time_start", nullable=false)
    private Date timeStart = new Date();
	@Column(name="time_end", nullable=false)
    private Date timeEnd = new Date();
	@Column(name="kilometrage_start", nullable=false)
	private Long kilometrageStart;
	@Column(name="kilometrage_end", nullable=false)
	private Long kilometrageEnd;
	@Column(nullable=false)
    private Date created = new Date();
	@Column(nullable=false)
	private Date modified = new Date();
    
    public Bookinghistory(){}
    
	public Bookinghistory(String chassis_number, Long customer_id, Date time_start, Date time_end,
			Long kilometrage_start, Long kilometrage_end) {
		super();
		this.chassisNumber = chassis_number;
		this.customerId = customer_id;
		this.timeStart = time_start;
		this.timeEnd = time_end;
		this.kilometrageStart = kilometrage_start;
		this.kilometrageEnd = kilometrage_end;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Date getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public Date getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Long getKilometrageStart() {
		return kilometrageStart;
	}

	public void setKilometrageStart(Long kilometrageStart) {
		this.kilometrageStart = kilometrageStart;
	}

	public Long getKilometrageEnd() {
		return kilometrageEnd;
	}

	public void setKilometrageEnd(Long kilometrageEnd) {
		this.kilometrageEnd = kilometrageEnd;
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
