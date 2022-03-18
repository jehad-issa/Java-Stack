package com.axsos.travels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;


import com.axsos.travels.models.Travel;
import com.axsos.travels.services.TravelServices;

@Controller

public class TravelController {

	@Autowired
	TravelServices travelService;
	
@GetMapping("/expense")
public String allTravels(Model model,Travel travel) {
	List<Travel>travels = travelService.alltravels();
	model.addAttribute("travels", travels);
	return "travel.jsp";
}
@PostMapping("/expense")
public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
    if (result.hasErrors()) {
        return "redirect:/expense";
    } else {
       travelService.createTravel(travel);
        return "redirect:/expense";
    }
}


}
