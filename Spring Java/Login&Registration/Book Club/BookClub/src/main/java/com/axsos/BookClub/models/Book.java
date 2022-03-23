package com.axsos.BookClub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class Book {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotNull
	    @Size(min = 5, max = 200, message="title must be between 5 and 200 characters")
	    private String title;
	    @NotNull
	    @Size(min = 5, max = 200, message="Author name must be between 5 and 200 characters")
	    private String autherName;
	    @NotNull
	    @Size(min = 3, max = 40 , message="Your thought must be between 3 and 40 characters")
	    private String myThought;
	   
	    
		

		@Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="user_id")
	    private User user;

		public Book(@NotNull @Size(min = 5, max = 200,message="title must be between 5 and 200 characters") String title,@NotNull @Size(min = 3, max = 40,message="Your thought must be between 3 and 40 characters") String myThought,
				@NotNull @Size(min = 5, max = 200,message="Author name must be between 5 and 200 characters") String autherName,
				User user) {
			this.title = title;
			this.autherName = autherName;
			this.user = user;
			this.myThought = myThought;
		}

		public Book() {
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAutherName() {
			return autherName;
		}

		public void setAutherName(String autherName) {
			this.autherName = autherName;
		}

	

		public String getMyThought() {
			return myThought;
		}

		public void setMyThought(String myThought) {
			this.myThought = myThought;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
		
		
		    
}
