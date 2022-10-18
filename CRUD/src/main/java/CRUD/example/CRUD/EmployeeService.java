package CRUD.example.CRUD;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class EmployeeService {

@Autowired
private EmployeeRepo1 erp;
@GetMapping("/new") 
/*
  public List<EmployeeEntity> list(){ 
  ArrayList<EmployeeEntity>transformedvalues=new ArrayList<EmployeeEntity>(); 
  for(EmployeeEntity emt:erp.findAll()) { 
	  EmployeeEntity temp=new EmployeeEntity();
      temp.setId(emt.getId());
      transformedvalues.add(temp); 
      } 
   return transformedvalues; 
   }
 
*/
public List<EmployeeEntity> getSample(){
	return erp.findAll();
}

}


