package com.pavan.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name =" orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	
	private String productName;
	private double price;
	private int quantity;
	
	public Order() {}
	
	
	public Order(long orderId, String productName, double price, int quantity) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	

}
