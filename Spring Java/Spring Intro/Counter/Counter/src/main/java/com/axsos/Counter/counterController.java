package com.axsos.Counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class counterController {
	@RequestMapping("/")
	public String home(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count + 1);
		}
		return "welcome.jsp";
	}

	@RequestMapping("/counter")
	public String count(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		model.addAttribute("count", session.getAttribute("count"));
		return "counter.jsp";
	}
}
