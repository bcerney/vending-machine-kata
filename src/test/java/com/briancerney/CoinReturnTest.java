package com.briancerney;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoinReturnTest {
	CoinReturn testReturn;

	@Before
	public void setUp() {
		testReturn = new CoinReturn();
	}

	@Test
	public void givenCoinReturnIsEmptyToStringReturnsCorrectString() {
		Assert.assertEquals("The coin return is empty!", testReturn.toString());
	}
	
	@Test
	public void givenCoinReturnContains1PennyToStringReturnsCorrectString() {
		testReturn.addCoin(Coin.PENNY);
		Assert.assertEquals("Coin return contains: 0 quarters, 0 dimes, 0 nickels, 1 penny", testReturn.toString());
	}

}
