package com.kpi.microservice.currencyexchangeexampleservice.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name="demo", url="localhost:8000")  
public interface CurrencyExchangeServiceProxy {
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}/ quantity/{quantity}")
	public  CurrencyConversionSampleBean1 retrieveExchangeValue(@PathVariable String from, @PathVariable String to)  ;
	
	
	}

