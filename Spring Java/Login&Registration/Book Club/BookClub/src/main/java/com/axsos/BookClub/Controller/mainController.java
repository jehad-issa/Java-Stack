package com.axsos.BookClub.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.BookClub.Service.BookService;
import com.axsos.BookClub.Service.UserService;
import com.axsos.BookClub.models.Book;
import com.axsos.BookClub.models.LoginUser;
import com.axsos.BookClub.models.User;

@Controller
public class mainController {

	@Autowired
    private UserService userServ;
	
	@Autowired
    private BookService bookServ;
	
	 @GetMapping("/")
	    public String form(Model model) {
	    
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
	        return "redirect:/books";
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
	        return "redirect:/books";
	    }


	   @GetMapping("/books")
	   public String home(@ModelAttribute("books")Book book, Model model ,HttpSession session) {
		   List<User> users=userServ.allUser();
			model.addAttribute("users",users);
			List<Book> books=bookServ.allBooks();
			model.addAttribute("books",books);

		   Long user_id = (Long) session.getAttribute("user_id");
		   User thisUser = userServ.findById(user_id);
		   model.addAttribute("thisUser",thisUser);
		   return "welcome.jsp";
	   }
	   
	   @GetMapping("/books/new")
	   public String newBook(@ModelAttribute("books")Book book) {
		   return "addbook.jsp";
	   }
	   
	   @PostMapping("/books/new")
	   public String createBook(@Valid @ModelAttribute("books")Book book,  BindingResult result, HttpSession session) {
		   Long user_id = (Long) session.getAttribute("user_id");
			User thisUser = userServ.findById(user_id);
		    book.setUser(thisUser);
		   if (result.hasErrors()) {
			   return "/books/new";
		   }else {
			   bookServ.createBook(book);
			   return "redirect:/books";
		   }
		   		   
	   }
	   
	   @RequestMapping("books/{bookId}")
	   public String showBook(Model model,@PathVariable("bookId") Long bookId) {
	   	Book book = bookServ.findBook(bookId);
	   	model.addAttribute("book", book);
	   	return "show.jsp";
	   }
	   
	   @GetMapping("/books/{id}/edit")
	   public String edit(@PathVariable("id") Long id, Model model) {
	       Book book = bookServ.findBook(id);
	       model.addAttribute("book", book);
	       return "edit.jsp";
	   }
	   
	   @PutMapping("/edit/{id}")
	   public String updateBook(@Valid @ModelAttribute("books") Book book, BindingResult result,@PathVariable("id") Long id) {
	       if (result.hasErrors()) {
	           return "edit.jsp";
	       } else {
	           bookServ.updateBook(book,id);
	           return "redirect:/books/"+id;
	       }
	   }



}
