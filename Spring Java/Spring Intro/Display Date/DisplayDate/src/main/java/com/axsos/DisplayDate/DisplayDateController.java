package com.axsos.DisplayDate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {
	@RequestMapping("/")
		public String DteTime() {
			return "DateTime.jsp";
		}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE ',' 'the' d 'of' MMMMM ',' y");
		model.addAttribute("date",dateFormat.format(new Date()));
		return "Date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat timeFormat = new SimpleDateFormat("K:mm a");
		model.addAttribute("time",timeFormat.format(new Date()));
		return "Time.jsp";
	}

	
	
	

}