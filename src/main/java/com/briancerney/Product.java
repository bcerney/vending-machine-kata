package com.briancerney;

public class Product {
	private String name;
	private ChangeAmount price;
	private int quantity;

	public Product() {

	}

	public Product(String name, ChangeAmount price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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

	public void reduceQuantityByOne() {
		if (quantity > 0) {
			setQuantity(getQuantity() - 1);
		}
	}

	public boolean isInStock() {
		return quantity > 0;
	}

	@Override
	public String toString() {
		return getName() + ", Price: " + getPriceAsString() + ", Quantity: " + getQuantity();
	}

}
