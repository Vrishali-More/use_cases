package com.vehicle.VehicleDB;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@Autowired
	private CarRepo cr; 

	@Autowired
	private BikeRepo bike;
	
	
	
	@GetMapping("/cart")
	public List<CarEntity>getSample1(){
		return cr.getjoin();
	}

	@Autowired
	private TruckRepo tr;
	
     @GetMapping("/Tyers") 
     public List<TruckEntity> getSample(){ 
    	 return tr.getjoin(); }
		
}