package com.example.InsuranceDB;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceController {

	@Autowired
	private ClientRepository c;
	
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

	
}