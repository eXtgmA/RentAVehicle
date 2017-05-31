package de.marvin.kuenkler.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import de.marvin.kuenkler.model.Bookinghistory;

@Transactional
public interface BookinghistoryDao extends CrudRepository<Bookinghistory, Long>{
	
	public Bookinghistory findByChassisNumber(String chassis_number);
}
