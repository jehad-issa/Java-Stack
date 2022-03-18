package com.axsos.travels.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.axsos.travels.models.Travel;
import com.axsos.travels.services.TravelServices;

@RestController
public class TravelApi {
	 private final TravelServices travelService;
	    public TravelApi(TravelServices travelService){
	        this.travelService = travelService;
	    }
	    @RequestMapping("/api/travels")
	    public List<Travel> travel() {
	        return travelService.alltravels();
	    }
	    
	    @RequestMapping(value="/api/travels", method=RequestMethod.POST)
	    public Travel create(@RequestParam(value="expense") String expense, 
	    					@RequestParam(value="vendor") String vendor, 
	    					@RequestParam(value="amount") double amount) {
	        Travel travel = new Travel(expense, vendor, amount);
	        return travelService.createTravel(travel);
	    }

	    
	    @RequestMapping("/api/travels/{id}")
	    public Travel show(@PathVariable("id") Long id) {
	        Travel travel = travelService.findTravel(id);
	        return travel;
}
}
