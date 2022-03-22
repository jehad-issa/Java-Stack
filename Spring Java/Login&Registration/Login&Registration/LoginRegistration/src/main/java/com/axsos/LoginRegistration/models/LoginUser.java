package com.axsos.LoginRegistration.models;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginUser {

	@NotEmpty(message="Email is required!")
    @Email(message="Please enter a valid email!")
    private String email;
    
    @NotEmpty(message="Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
    private String password;
    
    private Date createdAt;
    private Date updatedAt;
    
    
    
    
    
    public LoginUser(
			@NotEmpty(message = "Email is required!") @Email(message = "Please enter a valid email!") String email,
			@NotEmpty(message = "Password is required!") @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters") String password) {
		
		this.email = email;
		this.password = password;
	}

	public LoginUser() {
    	
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
 
	@PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    
}
