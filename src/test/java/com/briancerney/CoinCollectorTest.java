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
	public void givenAddCoinPassedQUARTERGetNumberOfCoinsReturns1() {
		testCollector.addCoin(Coin.QUARTER);
		
		Assert.assertEquals(1, testCollector.getNumberOfCoins());
	}
	
	@Test
	public void givenAddCoinQUARTERAndDIMEAndNICKELGetNumberOfCoinsReturns3() {
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.NICKEL);
		
		Assert.assertEquals(3, testCollector.getNumberOfCoins());
	}
	
	@Test
	public void givenAddCoinPassedPENNYGetNumberOfCoinsReturns0() {
		testCollector.addCoin(Coin.PENNY);
		
		Assert.assertEquals(0, testCollector.getNumberOfCoins());
	}
}
