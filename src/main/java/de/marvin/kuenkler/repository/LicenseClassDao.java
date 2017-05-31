package de.marvin.kuenkler.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import de.marvin.kuenkler.model.LicenseClass;

@Transactional
public interface LicenseClassDao extends CrudRepository<LicenseClass, Long>{

}
