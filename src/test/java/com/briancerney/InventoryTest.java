package com.briancerney;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class InventoryTest {
	
	Inventory testInventory;
	
	@Before
	public void setUp() {
		testInventory = new Inventory();
	}
	
	@Test
	public void givenIAddProductToInventoryGetNumberOfProductsReturns1() {
		testInventory.addProduct(1, new Product("Cola", new ChangeAmount(100), 3));
		
		Assert.assertEquals(1, testInventory.getNumberOfProducts());
	}
	
	@Test
	public void givenIAdd2ProductsToInventoryGetNumberOfProductsReturns2() {
		testInventory.addProduct(1, new Product("Cola", new ChangeAmount(100), 3));
		testInventory.addProduct(2, new Product("Chips", new ChangeAmount(50), 3));
		
		Assert.assertEquals(2, testInventory.getNumberOfProducts());
	}
	
	@Test
	public void givenIAddProductToInventoryGetProductBySlotKeyReturnsCorrectProduct() {
		Product testProduct = new Product("Cola", new ChangeAmount(100), 3);
		testInventory.addProduct(1, testProduct);
		Product testProductReturned = testInventory.getProductBySlotKey(1);
		
		Assert.assertEquals(testProduct.getName(), testProductReturned.getName());
		Assert.assertEquals(testProduct.getPriceAsString(), testProductReturned.getPriceAsString());
		Assert.assertEquals(testProduct.getQuantity(), testProductReturned.getQuantity());
	}

}
