package com.pavan.DTO;

import com.pavan.Entity.User;

public class ProductDTO {
	
	private String productName;
	private String description;
	private String color;
	
	
	
	

	public ProductDTO(String productName, String description, String color) {
		super();
		this.productName = productName;
		this.description = description;
		this.color = color;

	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	



	@Override
	public String toString() {
		return "ProductDTO [productName=" + productName + ", description=" + description + ", color=" + color
				+ "]";
	}


	
	
	
	
	
	
	

}
