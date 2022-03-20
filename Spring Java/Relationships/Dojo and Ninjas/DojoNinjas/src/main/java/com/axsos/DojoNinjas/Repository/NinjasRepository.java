package com.axsos.DojoNinjas.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.DojoNinjas.models.Ninja;


@Repository
public interface NinjasRepository extends CrudRepository<Ninja, Long> {
	 List<Ninja> findAll();

	
}
