package com.axsos.travels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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

@GetMapping("/expense/edit/{id}")
public String edit(@PathVariable("id") Long id, Model model) {
    Travel travel = travelService.findTravel(id);
    model.addAttribute("travel", travel);
    return "edit.jsp";
}
@PutMapping("/expense/{id}")
public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
    if (result.hasErrors()) {
        return "edit.jsp";
    } else {
        travelService.updateTravel(travel);
        return "redirect:/expense";
    }
}

@DeleteMapping("/expense/{id}")
public String destroy(@PathVariable("id") Long id) {
    travelService.deleteTravel(id);
    return "redirect:/expense";
}


}
