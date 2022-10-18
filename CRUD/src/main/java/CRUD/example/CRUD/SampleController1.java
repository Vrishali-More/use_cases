package CRUD.example.CRUD;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController1 {
	@Autowired
	private EmployeeRepo er; //up to date
	@GetMapping("/detail") 
	public List<EmployeeEntity> getSample(){
		ArrayList<EmployeeEntity> list1=new ArrayList<EmployeeEntity>();
    	for(EmployeeEntity emt:er.findAll()) {
    		EmployeeEntity temp2=new EmployeeEntity();
    		
    		if (emt.getEmployeeName().startsWith("a")) {
    		temp2.setId(emt.getId());
    		temp2.setEmployeeName(emt.getEmployeeName());
    		temp2.setDeperment(emt.getDeperment());
    		list1.add(temp2);
}
    	}
    	return list1;
	}
}
