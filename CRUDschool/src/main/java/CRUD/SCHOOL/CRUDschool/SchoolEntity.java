package CRUD.SCHOOL.CRUDschool;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " school1 ")
public class SchoolEntity {
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
			
			private Integer id;
	   
			private String schoolName;
	       
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getSchoolName() {
				return schoolName;
			}
			public void setSchoolName(String schoolName) {
				this.schoolName = schoolName;
			}
			
}
