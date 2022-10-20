package com.example.InsuranceDB;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policies")
public class PoliciesEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer pid;
	private String Rdate;
	private String Ptype;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	public String getRdate() {
		return Rdate;
	}
	public void setRdate(String rdate) {
		Rdate = rdate;
	}
	public String getPolicyType() {
		return Ptype;
	}
	public void setPolicyType(String policyType) {
		this.Ptype = policyType;
	}
	
	
}