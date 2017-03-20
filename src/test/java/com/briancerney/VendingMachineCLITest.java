package com.briancerney;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class VendingMachineCLITest {
	VendingMachineCLI testCLI;
	
	@Before
	public void setUp() {
		testCLI = new VendingMachineCLI();
	}
	
	@Test
	public void givenIsValidChoicePassed1ItReturnsTrue() {
		Assert.assertTrue(testCLI.isValidChoice(1));
	}
	
	@Test
	public void givenIsValidChoicePassed3ItReturnsTrue() {
		Assert.assertTrue(testCLI.isValidChoice(3));
	}

}
