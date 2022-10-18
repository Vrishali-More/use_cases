package CRUD.example.CRUD;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController2 {

	@Autowired
	private EmployeeRepo era; //up to date
	@GetMapping("/A") 
	public ArrayList<String> getempname(){
		
		ArrayList<String> emt1= new ArrayList<String>();
    	for(EmployeeEntity emt:era.findAll()) {
    			
    		if (emt.getEmployeeName().startsWith("a")) {
            emt1.add(emt.getEmployeeName());
    	}	
    	}
    	return emt1;
	}
	}
