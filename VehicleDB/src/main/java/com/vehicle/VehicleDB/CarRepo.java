package com.vehicle.VehicleDB;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<CarEntity, Integer>{

	@Query(value ="SELECT *FROM car c JOIN truck t ON t.Nooftyers=c.Nooftyers", nativeQuery=true)

  // public List<CarEntity>getjoin();
  List<CarEntity> findallsameNooftyers();
}

