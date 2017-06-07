package de.marvin.kuenkler.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import de.marvin.kuenkler.model.DrivingLicense;

@Transactional
public interface DrivingLicenseDao extends CrudRepository<DrivingLicense, Long>{

}
