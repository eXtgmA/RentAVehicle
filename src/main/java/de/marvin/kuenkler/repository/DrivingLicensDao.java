package de.marvin.kuenkler.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import de.marvin.kuenkler.model.DrivingLicens;

@Transactional
public interface DrivingLicensDao extends CrudRepository<DrivingLicens, Long>{

}
