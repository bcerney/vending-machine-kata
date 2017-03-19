package com.briancerney;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BalanceCalculatorTest {
	
	BalanceCalculator testCalculator;
	
	@Before
	public void setUp() {
		testCalculator = new BalanceCalculator();
	}
	
	@Test
	public void givenCoinCollectorContains1QuarterCalculateBalanceReturnsChangeAmountOf25() {
		CoinCollector testCollector = new CoinCollector();
		testCollector.addCoin(Coin.QUARTER);
		ChangeAmount testAmount = testCalculator.calculateBalance(testCollector);
		
		Assert.assertEquals(25, testAmount.getTotalAmountInCents());
	}
	
	@Test
	public void givenCoinCollectorContains2Quarters2Dimes2NickelsCalculateBalanceReturnsChangeAmountOf80() {
		CoinCollector testCollector = new CoinCollector();
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.NICKEL);
		testCollector.addCoin(Coin.NICKEL);

		ChangeAmount testAmount = testCalculator.calculateBalance(testCollector);
		
		Assert.assertEquals(80, testAmount.getTotalAmountInCents());
	}

}
