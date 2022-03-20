package com.axsos.DojoNinjas.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.DojoNinjas.models.Dojo;

@Repository
public interface DojoRepository  extends CrudRepository<Dojo, Long> {
	 List<Dojo> findAll();
}
