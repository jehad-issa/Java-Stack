package com.axsos.BookClub.Service;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.axsos.BookClub.Repository.UserRepository;
import com.axsos.BookClub.models.LoginUser;
import com.axsos.BookClub.models.User;

@Service
public class UserService {

	@Autowired
    private UserRepository userRepo;
	
	public User register(User newUser, BindingResult result) {
    	if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {
    		result.rejectValue("email", "Uniqe","This email is already use!");
    	}
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    		result.rejectValue("confirm", "Matches","The confirm password must match!");
    	}
    	if(result.hasErrors()) {
    		return null;
    	}else {
    		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    		newUser.setPassword(hashed);
    		return userRepo.save(newUser);
    	}
        
    }
	
	
	 public User login(LoginUser newLogin, BindingResult result) {
	    	if (result.hasErrors()) {
	        return null;
	    }
	    	Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
	    	if(!potentialUser.isPresent()) {
	    		result.rejectValue("email","Unique","Unknown email");
	    		return null;
	    	}
	    	User user = potentialUser.get();
	    	if(!BCrypt.checkpw(newLogin.getPassword(),user.getPassword())) {
	    		result.rejectValue("password", "Matches","Invalid password!");
	    	}
	    	if(result.hasErrors()) {
	    		return null;
	    	}else {
	    		return user;
	    	}
	    }
	 
	  public User findById(Long id) {
	    	Optional<User> j =userRepo.findById(id);
	    	if(j.isPresent()) {
	    		return j.get();
	    	}else {
	    		return null;
	    	}
	    }
	  public List<User> allUser(){
		  return userRepo.findAll();
	  }
}
