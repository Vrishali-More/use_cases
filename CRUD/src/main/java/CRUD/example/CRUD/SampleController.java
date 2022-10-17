package CRUD.example.CRUD;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@Autowired
	private EmployeeRepo er; //up to date
	@GetMapping("/sample") 
	public List<EmployeeEntity> getSample(){
		ArrayList<EmployeeEntity> transformedvalues=new ArrayList<EmployeeEntity>();
    	for(EmployeeEntity emt:er.findAll()) {
    		EmployeeEntity temp=new EmployeeEntity();
    		temp.setId(emt.getId());
    		if(emt.getEmployeeName().contains("$")) {
    			temp.setEmployeeName(emt.getEmployeeName().replaceAll("\\$", ""));
    		}
    		transformedvalues.add(temp);
    	}
    	return transformedvalues;
	}
	
}

