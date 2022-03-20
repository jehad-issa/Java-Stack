package com.axsos.DojoNinjas.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.DojoNinjas.Repository.NinjasRepository;
import com.axsos.DojoNinjas.models.Dojo;
import com.axsos.DojoNinjas.models.Ninja;

@Service
public class NinjaService {

	   private final NinjasRepository ninjasRepository;
	    
	    public NinjaService(NinjasRepository ninjasRepository) {
	        this.ninjasRepository = ninjasRepository;
	    }
	    
	    public List<Ninja> allninjas() {
	        return ninjasRepository.findAll();
	    }
	    
	    // creates a ninja
	    public Ninja createNinja(Ninja b) {
	        return ninjasRepository.save(b);
	    }
}

