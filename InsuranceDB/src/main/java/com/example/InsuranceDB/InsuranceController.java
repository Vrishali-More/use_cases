package com.example.InsuranceDB;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceController {

	@Autowired
	private ClientRepository c;
	
	// details of client using id
	
     @GetMapping("/c1")
   	public List<ClientEntity> join()
	{
		return c.getjoin(1);
	}
	
     @GetMapping("/c2")
    	public List<ClientEntity> join1()
 	{
 		return c.getjoin(2);
 	}
     @GetMapping("/c3")
    	public List<ClientEntity> join2()
 	{
 		return c.getjoin(3);
 	}

     @GetMapping("/c4")
 	public List<ClientEntity> join3()
	{
		return c.getjoin(4);
	}

     @GetMapping("/c5")
 	public List<ClientEntity> join4()
	{
		return c.getjoin(5);
	}
     // finding client details with term plan
     
     @GetMapping("/lessthanfive-5000")
     public List<ClientEntity> getfive(){
    	 return c.findBytermplanLessThan();
     }
     @GetMapping("/equaltofive-5000")
     public List<ClientEntity> getfive1(){
    	 return c.findBytermplanequal();
     }
     @GetMapping("/greaterthanfive-5000")
     public List<ClientEntity> getfive2()
     {
    	 return c.findBytermplanGreterThan();
     }
     // discount with user input 
   
       
     @GetMapping("/discount/{term}/{finalprice}")
     public int getdiscount(@PathVariable String term, @PathVariable int finalprice)
     {
    	 final String more="greaterthan5";
         final String equal="equalto5";
         final String less="lessthan5";
         int pay=0;
    	 
    	 if (term.equals(less)) {    
           return finalprice;
    	 }
    	 else if (term.equals(equal)) {
   		 pay=(10*finalprice)/100;
    	 }	
    	 else if(term.equals(more)) {
    	     pay=(12*finalprice)/100;
    	 }
    		return finalprice-pay;    	 
     }
     
}

     
  