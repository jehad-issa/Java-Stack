package com.axsos.LoginRegistration.Controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.LoginRegistration.Repository.UserRepository;
import com.axsos.LoginRegistration.Service.UserService;
import com.axsos.LoginRegistration.models.LoginUser;
import com.axsos.LoginRegistration.models.User;

@Controller
public class mainController {

	@Autowired
    private UserService userServ;
	
	  @GetMapping("/")
	    public String form(Model model) {
	    
	        // Bind empty User and LoginUser objects to the JSP
	        // to capture the form input
	        model.addAttribute("newUser", new User());
	        model.addAttribute("newLogin", new LoginUser());
	        return "form.jsp";
	    }
	  @PostMapping("/register")
	    public String register(@Valid @ModelAttribute("newUser") User newUser, 
	            BindingResult result, Model model, HttpSession session) {
	       userServ.register(newUser, result);
	        if(result.hasErrors()) {
	            model.addAttribute("newLogin", new LoginUser());
	            return "form.jsp";
	        }
	        
	        session.setAttribute("user_id", newUser.getId());
	        return "redirect:/home";
	    }
	  
	   @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        User user = userServ.login(newLogin, result);
	        if(result.hasErrors()) {
	            model.addAttribute("newUser", new User());
	            return "form.jsp";
	        }
	        session.setAttribute("user_id", user.getId());
	        return "redirect:/home";
	    }
	   
	   @GetMapping("/home")
	   public String home(Model model ,HttpSession session) {
		   Long user_id = (Long) session.getAttribute("user_id");
		   User thisUser = userServ.findById(user_id);
		   model.addAttribute("thisUser",thisUser);
		   return "welcome.jsp";
	   }
	   
}
