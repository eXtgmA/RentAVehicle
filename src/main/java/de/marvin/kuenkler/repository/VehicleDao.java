package de.marvin.kuenkler.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import de.marvin.kuenkler.model.Vehicle;

@Transactional
public interface VehicleDao extends CrudRepository<Vehicle, String>{

}
