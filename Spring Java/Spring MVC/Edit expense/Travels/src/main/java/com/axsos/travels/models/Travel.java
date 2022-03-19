package com.axsos.travels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="travels")
public class Travel {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	@NotNull
	    @Size(min = 5, max = 200, message="expense must be at least 5characters")
	    private String expense;
	    @NotNull
	    @Size(min = 5, max = 200,message="expense must be at least 5characters")
	    private String vendor;
	    @NotNull
	    @Min(value=1, message="Must be at least 1 $")
	    private double amount;
	    
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public Travel() {
	    }
	    
	    
	    public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getExpense() {
			return expense;
		}


		public void setExpense(String expense) {
			this.expense = expense;
		}


		public String getVendor() {
			return vendor;
		}


		public void setVendor(String vendor) {
			this.vendor = vendor;
		}


		public double getAmount() {
			return amount;
		}


		public void setAmount(double amount) {
			this.amount = amount;
		}

		public Travel(String expense, String vendor, double amount) {
	        this.expense = expense;
	        this.vendor = vendor;
	        this.amount = amount;
	    }
	    
	    // other getters and setters removed for brevity
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
}
