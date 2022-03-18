package com.axsos.travels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.travels.models.Travel;

@Repository
public interface TravelRepositories extends CrudRepository<Travel, Long>{

	  
    List<Travel> findAll();

}
