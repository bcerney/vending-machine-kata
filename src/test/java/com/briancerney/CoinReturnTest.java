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
	
	@Test
	public void givenCoinReturnContains2PenniesToStringReturnsCorrectString() {
		testReturn.addCoin(Coin.PENNY);
		testReturn.addCoin(Coin.PENNY);

		Assert.assertEquals("Coin return contains: 0 quarters, 0 dimes, 0 nickels, 2 pennies", testReturn.toString());
	}
	
	@Test
	public void givenCoinReturnContains2Nickels2PenniesToStringReturnsCorrectString() {
		testReturn.addCoin(Coin.NICKEL);
		testReturn.addCoin(Coin.NICKEL);
		testReturn.addCoin(Coin.PENNY);
		testReturn.addCoin(Coin.PENNY);

		Assert.assertEquals("Coin return contains: 0 quarters, 0 dimes, 2 nickels, 2 pennies", testReturn.toString());
	}
	
	@Test
	public void givenCoinReturnContains2Dimes2Nickels2PenniesToStringReturnsCorrectString() {
		testReturn.addCoin(Coin.DIME);
		testReturn.addCoin(Coin.DIME);
		testReturn.addCoin(Coin.NICKEL);
		testReturn.addCoin(Coin.NICKEL);
		testReturn.addCoin(Coin.PENNY);
		testReturn.addCoin(Coin.PENNY);

		Assert.assertEquals("Coin return contains: 0 quarters, 2 dimes, 2 nickels, 2 pennies", testReturn.toString());
	}
	
	@Test
	public void givenCoinReturnContains2Quarters2Dimes2Nickels2PenniesToStringReturnsCorrectString() {
		testReturn.addCoin(Coin.QUARTER);
		testReturn.addCoin(Coin.QUARTER);
		testReturn.addCoin(Coin.DIME);
		testReturn.addCoin(Coin.DIME);
		testReturn.addCoin(Coin.NICKEL);
		testReturn.addCoin(Coin.NICKEL);
		testReturn.addCoin(Coin.PENNY);
		testReturn.addCoin(Coin.PENNY);

		Assert.assertEquals("Coin return contains: 2 quarters, 2 dimes, 2 nickels, 2 pennies", testReturn.toString());
	}
	
	@Test
	public void givenCoinReturnContains2Quarters2Dimes2NickelsToStringReturnsCorrectString() {
		testReturn.addCoin(Coin.QUARTER);
		testReturn.addCoin(Coin.QUARTER);
		testReturn.addCoin(Coin.DIME);
		testReturn.addCoin(Coin.DIME);
		testReturn.addCoin(Coin.NICKEL);
		testReturn.addCoin(Coin.NICKEL);

		Assert.assertEquals("Coin return contains: 2 quarters, 2 dimes, 2 nickels, 0 pennies", testReturn.toString());
	}
	
	@Test
	public void givenCoinReturnContains2Quarters2DimesToStringReturnsCorrectString() {
		testReturn.addCoin(Coin.QUARTER);
		testReturn.addCoin(Coin.QUARTER);
		testReturn.addCoin(Coin.DIME);
		testReturn.addCoin(Coin.DIME);

		Assert.assertEquals("Coin return contains: 2 quarters, 2 dimes, 0 nickels, 0 pennies", testReturn.toString());
	}

}
