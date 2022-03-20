package com.axsos.DojoNinjas.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.DojoNinjas.Service.DojoService;
import com.axsos.DojoNinjas.Service.NinjaService;
import com.axsos.DojoNinjas.models.Dojo;
import com.axsos.DojoNinjas.models.Ninja;


@Controller
public class MainController {
	
	@Autowired
	DojoService dojoService;
	
	@Autowired
	NinjaService ninjaService;

	
	
	@GetMapping("/dojos/new")
	public String dojo(@ModelAttribute("dojo") Dojo dojo) {
		return "dojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String newDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
	    if (result.hasErrors()) {
	        return "redirect:/dojos/new";
	    } else {
	       dojoService.createDojo(dojo);
	        return "redirect:/ninjas/new";
	    }
	}
	
	@GetMapping("/ninjas/new")
	public String ninja(Model model, @ModelAttribute("ninjas") Ninja ninjas) {
		List<Dojo> dojos=dojoService.allDojos();
		model.addAttribute("dojos",dojos);
		return "ninja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String newDojo(@Valid @ModelAttribute("ninjas") Ninja ninjas, BindingResult result) {
			ninjaService.createNinja(ninjas);
	        return "redirect:/ninjas/new";
	    }
	
	@RequestMapping("dojos/{id}")
	public String show(Model model,@PathVariable("id") Long id) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "show.jsp";
	}
	
}