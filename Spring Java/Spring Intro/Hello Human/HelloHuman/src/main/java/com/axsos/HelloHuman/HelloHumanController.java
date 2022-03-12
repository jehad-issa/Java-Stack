package com.axsos.HelloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@RequestMapping("")
	public String greeting (@RequestParam(value="q",required=false) String name) {
		if(name == null) {
			return ("welcome human");
		}else {
			return ("welcome " + name);
		}
	}
}
