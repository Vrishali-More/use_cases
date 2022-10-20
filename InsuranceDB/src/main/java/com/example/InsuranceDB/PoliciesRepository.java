package com.example.InsuranceDB;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PoliciesRepository extends JpaRepository<PoliciesEntity, Integer> {

	@Query(value="select*from policies p where p.pid=?1",nativeQuery=true)
    
	List<PoliciesEntity> getjoin2();
	
}
