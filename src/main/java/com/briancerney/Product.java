package com.briancerney;

public class Product {
	private String name;
	private ChangeAmount price;
	private int quantity;
	
	public Product() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ChangeAmount getPrice() {
		return price;
	}
	
	public String getPriceAsString() {
		return price.toString();
	}

	public void setPrice(ChangeAmount price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
