package com.example.InsuranceDB;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepository extends JpaRepository<ClientEntity, Integer>{
  
	// getting client with id
	
  	@Query(value=" select *from client c where c.id=?1",nativeQuery=true)

	 List<ClientEntity> getjoin(Integer id);
  	
  	// for getting client with termplan
  	
  	@Query (value="select*from client where termplan < '5 years'",nativeQuery=true)
    List<ClientEntity>findBytermplanLessThan();
  	
  	@Query(value="select*from client where termplan='5 years'",nativeQuery=true)
  	List<ClientEntity>findBytermplanequal();
  	
  	@Query(value="select*from client where termplan > '5 years'",nativeQuery=true)
  	List<ClientEntity>findBytermplanGreterThan();
  	
}
