package com.briancerney;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CoinCollectorTest {
	CoinCollector testCollector;
	
	@Before
	public void setUp() {
		testCollector = new CoinCollector();
	}
	
	@Test
	public void givenAddCoinPassedQUARTERGetNumberOfCoinsReturnss1() {
		Coin testCoin = Coin.QUARTER;
		testCollector.addCoin(testCoin);
		
		Assert.assertEquals(1, testCollector.getNumberOfCoins());
	}
}
