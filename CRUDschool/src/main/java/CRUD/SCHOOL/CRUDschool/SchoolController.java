package CRUD.SCHOOL.CRUDschool;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
	 
	@Autowired
	private SchoolRepo er; //up to date
	@GetMapping("/school") 
	public List<SchoolEntity> getSample(){
		ArrayList<SchoolEntity> transformedvalues=new ArrayList<SchoolEntity>();
    	for(SchoolEntity smt:er.findAll()) {
    		SchoolEntity temp=new SchoolEntity();
    		temp.setId(smt.getId());
			/*
			 * if(smt.getSchoolName().contains(" ")) {
			 * temp.setSchoolName(smt.getSchoolName().replaceAll("\\$", "")); }
			 */
    		int len=smt.getSchoolName().length();
    		if(len==4) {
    		temp.setSchoolName(smt.getSchoolName());
    		transformedvalues.add(temp);
    	}}
    	return transformedvalues;
	}
	
}
	

