package com.axsos.travels.services;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.axsos.travels.models.Travel;
import com.axsos.travels.repositories.TravelRepositories;

@Service
public class TravelServices {

	  private final TravelRepositories travelRepository;
	    
	    public TravelServices(TravelRepositories travelRepository) {
	        this.travelRepository = travelRepository;
	    }
	    // returns all the travels
	    public List<Travel> alltravels() {
	        return travelRepository.findAll();
	    }
	    // creates a travel
	    public Travel createTravel(Travel b) {
	        return travelRepository.save(b);
	    }
	    // retrieves a travel
	    public Travel findTravel(Long id) {
	        Optional<Travel> optionalTravel = travelRepository.findById(id);
	        if(optionalTravel.isPresent()) {
	            return optionalTravel.get();
	        } else {
	            return null;
	        }
	    }
	    
		public Travel updateTravel(Long id, String expense, String vendor, double amount) {
			this.findTravel(id);
	        Travel travel =this.findTravel(id);
	        if(travel == null) {
	        	return null;
	        }
	        else {
	        	travel.setExpense(expense);
	        	travel.setVendor(vendor);
	        	travel.setAmount(amount);
	        	
	        	return travelRepository.save(travel);
	        }
}
		public void updateTravel( Travel travel) {
			Travel updatedTravel = travelRepository.findById(travel.getId()).orElse(null);
			updatedTravel.setAmount(travel.getAmount());
			updatedTravel.setExpense(travel.getExpense());
			updatedTravel.setVendor(travel.getVendor());
			travelRepository.save(updatedTravel);
		}
		public void deleteTravel(Long id) {
			travelRepository.deleteById(id);
			
	}
//		public Travel deleteTravel(Long id, String expense, String vendor, double amount) {
//			this.findTravel(id);
//	        Travel travel =this.findTravel(id);
//	        if(travel == null) {
//	        	return null;
//	        }
//	        else {
//	        	travel.setExpense(expense);
//	        	travel.setVendor(vendor);
//	        	travel.setAmount(amount);
//	        	
//	        	return travelRepository.save(travel);}
//		}
//		public void deleteTravel( Travel travel) {
//			Travel deleteTravel = travelRepository.findById(travel.getId()).orElse(null);
//			deleteTravel.setAmount(travel.getAmount());
//			deleteTravel.setExpense(travel.getExpense());
//			deleteTravel.setVendor(travel.getVendor());
//			travelRepository.save(deleteTravel);
//		}
}
