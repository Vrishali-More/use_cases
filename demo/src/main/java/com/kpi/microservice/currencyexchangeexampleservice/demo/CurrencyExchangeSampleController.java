package com.kpi.microservice.currencyexchangeexampleservice.demo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController  
public class CurrencyExchangeSampleController {
 
	 private Logger logger = LoggerFactory.logger(this.getClass());
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}") //where {from} and {to} represents the column   
	//returns a bean back  
	public CurrencyConversionSampleBean1 convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity)  
	{  
	//setting variables to currency exchange service  
	Map<String, String>uriVariables=new HashMap<>();  
	uriVariables.put("from", from);  
	uriVariables.put("to", to);  
	//calling the currency-exchange-service  
	ResponseEntity<CurrencyConversionSampleBean1>responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionSampleBean1.class, uriVariables);  
	
	CurrencyConversionSampleBean1 response=responseEntity.getBody();  
	//creating a new response bean and getting the response back and taking it into Bean  
	return new CurrencyConversionSampleBean1(response.getId(), from,to,response.getConversionMultiple(), quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());  
	} 
	

	@Autowired  
	private CurrencyExchangeServiceProxy proxy;  
	
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/ quantity/{quantity}")
	 public CurrencyConversionSampleBean1 convertCurrencyFeign(@PathVariable String from, @PathVariable String to,@PathVariable BigDecimal quantity)
	{
			CurrencyConversionSampleBean1  response = proxy.retrieveExchangeValue(from, to);		
			return new CurrencyConversionSampleBean1(response.getId(), from, to, response.getConversionMultiple(), quantity,
			        quantity.multiply(response.getConversionMultiple()), response.getPort());
		}

}
