package CRUD.example.CRUD;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepermentController {
	@Autowired
	private EmployeeRepo era; //up to date
	@GetMapping("/deperment") 
	public ArrayList<String> getempname(){
		
		ArrayList<String> eid= new ArrayList<String>();
    	for(EmployeeEntity emtname:era.findAll()) {
        
            eid.add(emtname.getDeperment());
    	}	
    	return eid;
	}

}
