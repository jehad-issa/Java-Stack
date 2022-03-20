package com.axsos.DojoNinjas.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.DojoNinjas.Repository.DojoRepository;
import com.axsos.DojoNinjas.models.Dojo;
import com.axsos.DojoNinjas.models.Ninja;
@Service
public class DojoService {

	  private final DojoRepository dojoRepository;
	    
	    public DojoService(DojoRepository dojoRepository) {
	        this.dojoRepository = dojoRepository;
	    }
	    
	    
	    public List<Dojo> allDojos() {
	        return dojoRepository.findAll();
	    }
	    // creates a dojo
	    public Dojo createDojo(Dojo b) {
	        return dojoRepository.save(b);
	    }
	    
	    public Dojo findDojo(Long id) {
	        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
	        if(optionalDojo.isPresent()) {
	            return optionalDojo.get();
	        } else {
	            return null;
	        }
	    }

	    
	   


}



