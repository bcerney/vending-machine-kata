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

}
