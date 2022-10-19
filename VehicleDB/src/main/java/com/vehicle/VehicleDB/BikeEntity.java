package com.vehicle.VehicleDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bike")

public class BikeEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer bikeid;
	private String bike_Name;
	private Integer Nooftyers;
	
	public Integer getBikeid() {
		return bikeid;
	}
	public void setBikeid(Integer bikeid) {
		this.bikeid = bikeid;
	}
	public String getBike_Name() {
		return bike_Name;
	}
	public void setBike_Name(String bike_Name) {
		this.bike_Name = bike_Name;
	}
	public Integer getNoOfTyers() {
		return Nooftyers;
	}
	public void setNoOfTyers(Integer noOfTyers) {
		Nooftyers = noOfTyers;
	}	
	
}
