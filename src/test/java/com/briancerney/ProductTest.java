package com.briancerney;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ProductTest {
	Product testProduct;
	
	@Before
	public void setUp() {
		testProduct = new Product();
	}
	
	@Test
	public void productSettersAndGettersWorkCorrectly() {
		testProduct.setName("Cola");
		testProduct.setPrice(new ChangeAmount(100));
		testProduct.setQuantity(3);
		
		Assert.assertEquals("Cola", testProduct.getName());
		Assert.assertEquals(new ChangeAmount(100), testProduct.getPrice());
		Assert.assertEquals("$1.00", testProduct.getPriceAsString());
		Assert.assertEquals(3, testProduct.getQuantity());
	}
	
	@Test
	public void productToStringWorksCorrectly() {
		testProduct = new Product("Chips", new ChangeAmount(50), 3);
		
		Assert.assertEquals("Chips, Price: $0.50, Quantity: 3", testProduct.toString());
	}
}
