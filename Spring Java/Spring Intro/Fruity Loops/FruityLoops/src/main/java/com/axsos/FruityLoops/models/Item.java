package com.axsos.FruityLoops.models;

public class Item {

	 private String name;
	    private double price;
	    
	    // CONSTRUCTOR
//	    public Item() {
//	    }
	    public Item(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }
	    //	getter&setter for name    	
	    public void setname(String name) {
	        this.name = name;
	    }
	    
	    public String getname() {
	        return name;
	    }
	    //	getter&setter for price
	    public void setprice(double price) {
	        this.price = price;
	    }
	    
	    public double getprice() {
	        return price;
	    }
	    
	    
	    
}
