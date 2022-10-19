package com.vehicle.VehicleDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="truck")
public class TruckEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer Truckid;
	private String Truck_Name;
	private Integer Nooftyers;
	
	public Integer getTruckid() {
		return Truckid;
	}
	public void setTruckid(Integer truckid) {
		this.Truckid = truckid;
	}
	public String getTruck_Name() {
		return Truck_Name;
	}
	public void setTruck_Name(String truck_Name) {
		this.Truck_Name = truck_Name;
	}
	public Integer getNoOfTyers() {
		return Nooftyers;
	}
	public void setNoOfTyers(Integer noOfTyers) {
		Nooftyers = noOfTyers;
	}
	
}