package com.javapoint.microservices.currencyconversionservices;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
public class CurrencyConversionController {
	
	//private org.jboss.logging.Logger logger = LoggerFactory.logger(this.getClass());
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/ quantity/{quantity}") //where {from} and {to} represents the column   
	//return a bean back  
	
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity)  
	{  
		Map<String, String>uriVariables=new HashMap<>();  
		uriVariables.put("from", from);  
		uriVariables.put("to", to);  
		//calling the currency-exchange-service  
		ResponseEntity<CurrencyConversionBean>responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class, uriVariables);  
		CurrencyConversionBean response=responseEntity.getBody();  
		//creating a new response bean and getting the response back and taking it into Bean  
		return new CurrencyConversionBean(response.getId(), from,to,response.getConversionMultiple(), quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());  
	
	}  
	
	 @Autowired
	  private CurrencyExchangeServiceProxy proxy;

	  @GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	  public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to,@PathVariable BigDecimal quantity) {

	    CurrencyConversionBean response = proxy.retrieveExchangeValue(from, to);

	   // logger.info("{}", response);

	    return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
	        quantity.multiply(response.getConversionMultiple()), response.getPort());
	  }
	
}
