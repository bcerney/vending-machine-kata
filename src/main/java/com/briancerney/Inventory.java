package com.briancerney;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
	private Map<Integer,Product> inventoryMap;
	
	public Inventory() {
		this.inventoryMap = new HashMap<Integer,Product>();
	}
	
	public void addProduct(int slotKey, Product productToAdd) {
		inventoryMap.put(slotKey,productToAdd);
	}
	
	public int getNumberOfProducts() {
		return inventoryMap.size();
	}

}
