package CRUD.example.CRUD;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdController {
	@Autowired
	private EmployeeRepo era; //up to date
	@GetMapping("/id") 
	public ArrayList<Integer> getempId(){
		//ArrayList<EmployeeEntity> list=new ArrayList<EmployeeEntity>();
		ArrayList<Integer> eid= new ArrayList<Integer>();
    	for(EmployeeEntity emtId:era.findAll()) {
            eid.add(emtId.getId());
    	}	
    	return eid;
	}
}
