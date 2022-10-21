package com.example.InsuranceDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController3 {
	@Autowired
	private ClientRepository c1;
	
	@GetMapping("/discount/{tenure}/{premium}")
	  public int getdiscount(@PathVariable String tenure , @PathVariable int premium)
    {
   	 final String more="greaterthan5";
        final String equal="equalto5";
        final String less="lessthan5";
        int pay=0;
   	 
   	 if (tenure==less) {    
          return premium;
   	 }
   	 else if (tenure==equal) {
  		 pay=(10*premium)/100;
   	 }	
   	 else if(tenure==more) {
   	     pay=(12*premium)/100;
   	 }
   		return premium-pay;    	 
    }
    
	
}
