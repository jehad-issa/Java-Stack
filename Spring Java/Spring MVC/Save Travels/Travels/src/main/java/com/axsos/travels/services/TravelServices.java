package com.axsos.travels.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.travels.models.Travel;
import com.axsos.travels.repositories.TravelRepositories;

@Service
public class TravelServices {

	  private final TravelRepositories travelRepository;
	    
	    public TravelServices(TravelRepositories travelRepository) {
	        this.travelRepository = travelRepository;
	    }
	    // returns all the books
	    public List<Travel> alltravels() {
	        return travelRepository.findAll();
	    }
	    // creates a book
	    public Travel createTravel(Travel b) {
	        return travelRepository.save(b);
	    }
	    // retrieves a book
	    public Travel findTravel(Long id) {
	        Optional<Travel> optionalTravel = travelRepository.findById(id);
	        if(optionalTravel.isPresent()) {
	            return optionalTravel.get();
	        } else {
	            return null;
	        }
	    }
}
