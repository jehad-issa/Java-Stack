package com.axsos.OmikujiForm;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
 @RequestMapping("/omikuji")
public class FormController {
	 @RequestMapping("")
	public String form() {
		 return "form.jsp";
	 }
	 
		@RequestMapping(value="/send" , method=RequestMethod.POST)
		public String send(HttpSession session,
				@RequestParam(value="counter") Integer counter,
			    @RequestParam(value="city") String city,
			    @RequestParam(value="person") String person,
			    @RequestParam(value="hobby") String hobby,
			    @RequestParam(value="living") String living,
			    @RequestParam(value="desc") String desc){
			  session.setAttribute("counter",counter);
			  session.setAttribute("city",city);
			  session.setAttribute("person",person);
			  session.setAttribute("hobby",hobby);
			  session.setAttribute("living",living);
			  session.setAttribute("desc",desc);
			return "redirect:/omikuji/show";
		}

	 
	@RequestMapping("/show")
		public String show(HttpSession session,Model model) {
		model.addAttribute("couter",(Integer) session.getAttribute("count"));
		model.addAttribute("city",(String) session.getAttribute("city"));
		model.addAttribute("person",(String) session.getAttribute("person"));
		model.addAttribute("hobby",(String) session.getAttribute("hobby"));
		model.addAttribute("living",(String) session.getAttribute("living"));
		model.addAttribute("desc",(String) session.getAttribute("desc"));

		
			 return "show.jsp";
		 }
	 


}
