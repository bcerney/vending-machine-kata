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
	
	@Test
	public void givenProductQuantityIs1IsInStockReturnsTrue() {
		testProduct = new Product("Chips", new ChangeAmount(50), 3);
		
		Assert.assertTrue(testProduct.isInStock());
	}
	
	@Test
	public void givenProductQuantityIs0IsInStockReturnsFalse() {
		testProduct = new Product("Chips", new ChangeAmount(50), 0);
		
		Assert.assertFalse(testProduct.isInStock());
	}
	
	@Test
	public void givenProductQuantityIs3ReduceQuantityByOneReducesQuantityTo2() {
		testProduct = new Product("Chips", new ChangeAmount(50), 3);
		testProduct.reduceQuantityByOne();
		
		Assert.assertEquals(2, testProduct.getQuantity());
	}
	
	@Test
	public void givenProductQuantityIs1ReduceQuantityByOneReducesQuantityTo0() {
		testProduct = new Product("Chips", new ChangeAmount(50), 1);
		testProduct.reduceQuantityByOne();
		
		Assert.assertEquals(0, testProduct.getQuantity());
	}
	
	@Test
	public void givenProductQuantityIs0ReduceQuantityByOneDoesNotReduceQuantityToNegativeOne() {
		testProduct = new Product("Chips", new ChangeAmount(50), 0);
		testProduct.reduceQuantityByOne();
		
		Assert.assertEquals(0, testProduct.getQuantity());
	}
	
	
}
