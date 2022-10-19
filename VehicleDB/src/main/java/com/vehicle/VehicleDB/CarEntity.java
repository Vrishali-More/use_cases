package com.vehicle.VehicleDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class CarEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer carid;
	private String car_name;
	private Integer Nooftyers;
	


	public Integer getCarId() {
		return carid;
	}


	public void setCarId(Integer carId) {
		this.carid = carId;
	}


	public String getCar_name() {
		return car_name;
	}


	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}


	public Integer getNoOfTyers() {
		return Nooftyers;
	}


	public void setNoOfTyers(Integer noOfTyers) {
		Nooftyers = noOfTyers;
	}
     
}
