package com.springboot.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.errorhandling.InvalidUserInputException;
import com.springboot.rest.model.TacoLocoModel;
  
  @RestController
  @RequestMapping("/api")
  public class TacoLocoController {

  	@GetMapping
  	public TacoLocoModel getUserInput(@RequestParam(value="vegie") int vegie, 
  			@RequestParam(value="chicken") int chicken, @RequestParam(value="beef") int beef, @RequestParam(value="chorizo") int chorizo) 
  	{
  
  		if (vegie<0 || chicken<0 || beef<0 || chorizo < 0 ) {
  	      throw new InvalidUserInputException(
  	          "User entered an invalid quantity that is less than 0");
  	    }
  		TacoLocoModel response = new TacoLocoModel();
  		
  		response.setQuantity_Veggie_Taco(vegie);
  		response.setQuantity_Chicken_Taco(chicken);
  		response.setQuantity_Beef_Taco(beef);
  		response.setQuantity_Chorizo_Taco(chorizo);
  		
  		//get final price
  		response.getFinalPrice();
  		
  		return response;
  	}
}