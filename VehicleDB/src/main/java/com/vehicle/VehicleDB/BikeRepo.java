package com.vehicle.VehicleDB;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepo extends JpaRepository<BikeEntity, Integer> {
	@Query(value ="SELECT *FROM car c JOIN Bike b ON b.Nooftyers=c.Nooftyers ;", nativeQuery=true)

	   public List<BikeEntity>getjoin2();
	//  List<BikeEntity> findallsameNooftyers();
}
