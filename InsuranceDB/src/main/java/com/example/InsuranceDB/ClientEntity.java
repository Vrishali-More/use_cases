package com.example.InsuranceDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="client")
public class ClientEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
	private String name;
	private String address;
	private String Mobile;
	private String dob;
	private String policy;
	private String inssurance;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return Mobile;
	}
	public void setMobileNo(String mobileNo) {
		this.Mobile = mobileNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getInssurance() {
		return inssurance;
	}
	public void setInssurance(String inssurance) {
		this.inssurance = inssurance;
	}

}