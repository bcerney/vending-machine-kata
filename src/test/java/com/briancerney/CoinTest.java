package com.briancerney;

import org.junit.Assert;
import org.junit.Test;

public class CoinTest {
	Coin testCoin;
	
	@Test
	public void givenSetWeightInGrams6SetDiameterInMm24CoinGettersReturnCorrectValues() {
		testCoin = new Coin();
		testCoin.setWeightInGrams(6);
		testCoin.setDiameterInMm(24);
		
		Assert.assertEquals(6, testCoin.getWeightInGrams());
		Assert.assertEquals(24, testCoin.getDiameterInMm());
	}
	
	@Test
	public void givenCoinPassed6And24InConstructorsCoinGettersReturnCorrectValues() {
		testCoin = new Coin(6,24);

		Assert.assertEquals(6, testCoin.getWeightInGrams());
		Assert.assertEquals(24, testCoin.getDiameterInMm());
	}
	
	@Test
	public void coinQUARTERWeightInGramsEquals6DiameterInMmEquals24() {
		testCoin = Coin.QUARTER;
		
		Assert.assertEquals(6, testCoin.getWeightInGrams());
		Assert.assertEquals(24, testCoin.getDiameterInMm());
	}
	
	@Test
	public void coinDIMEWeightInGramsEquals2DiameterInMmEquals18() {
		testCoin = Coin.DIME;
		
		Assert.assertEquals(2, testCoin.getWeightInGrams());
		Assert.assertEquals(18, testCoin.getDiameterInMm());
	}

}
