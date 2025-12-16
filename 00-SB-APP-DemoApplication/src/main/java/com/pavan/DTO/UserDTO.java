package com.pavan.DTO;

import java.util.ArrayList;
import java.util.List;

import com.pavan.Entity.Product;



public class UserDTO {

     private String userName; // lowercase first letter
     private String emailId;
     private String password;
     
     
     private List<Product> products = new ArrayList<>();
     
     


    public UserDTO() {
        // Jackson requires default constructor
    }



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public List<Product> getProducts() {
		return products;
	}



	public void setProducts(List<Product> products) {
		this.products = products;
	}



	public UserDTO(String userName, String emailId, String password, List<Product> products) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.products = products;
	}




	
   
    
}
