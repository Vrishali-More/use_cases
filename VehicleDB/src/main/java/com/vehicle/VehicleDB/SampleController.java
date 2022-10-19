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
	private BikeRepo b;
	
	@Autowired
	private TruckRepo tr;
	
	 @GetMapping("/cart") 
	public List<CarEntity>getsamle(){
		 return cr.findallsameNooftyers();
	 }
	 @GetMapping("/truckt") 
		public List<TruckEntity>getsamle1(){
			 return tr.findallsameNooftyers();
		 }
	 
	 @GetMapping("/biket") 
		public List<BikeEntity>getsamle2(){
			 return b.findallsameNooftyers();
		 }
	 
	/*
     @GetMapping("/Tyers") 
     public List<TruckEntity> getSample(){ 
    	 return tr.getjoin(); 
}
    		@GetMapping("/cart")
    		public List<CarEntity>getSample1(){
    			return cr.getjoin();
    		}	 
     */
		
}