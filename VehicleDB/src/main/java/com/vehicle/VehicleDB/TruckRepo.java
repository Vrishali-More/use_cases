package com.vehicle.VehicleDB;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepo extends JpaRepository<TruckEntity, Integer>{
	
	@Query(value ="SELECT *FROM truck t JOIN car c ON t.Nooftyers=c.Nooftyers", nativeQuery=true)

      public List<TruckEntity>getjoin();
	
}


