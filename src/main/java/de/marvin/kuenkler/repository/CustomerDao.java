package de.marvin.kuenkler.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import de.marvin.kuenkler.model.Customer;

@Transactional
public interface CustomerDao extends CrudRepository<Customer, Long>{

}
