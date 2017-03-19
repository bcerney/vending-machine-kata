package com.briancerney;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisplayTest {
	Display testDisplay;
	
	@Before
	public void setUp() {
		testDisplay = new Display();
	}
	
	@Test
	public void givenGetCurrentDisplayPassedCoinCollectorSize0ReturnsINSERTCOIN() {
		CoinCollector testCollector = new CoinCollector();
		
		Assert.assertEquals("INSERT COIN", testDisplay.getCurrentDisplay(testCollector));
	}
	
	@Test
	public void givenGetCurrentDisplayPassedCoinCollectorWith1QuarterReturnsCorrectBalanceAsString() {
		CoinCollector testCollector = new CoinCollector();
		testCollector.addCoin(Coin.QUARTER);
		
		Assert.assertEquals("Current Balance: $0.25", testDisplay.getCurrentDisplay(testCollector));
	}
	
	@Test
	public void givenGetCurrentDisplayPassedCoinCollectorWith2Quarters2Dimes2NickelsReturnsCorrectBalanceAsString() {
		CoinCollector testCollector = new CoinCollector();
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.NICKEL);
		testCollector.addCoin(Coin.NICKEL);
		
		Assert.assertEquals("Current Balance: $0.80", testDisplay.getCurrentDisplay(testCollector));
	}
	
	@Test
	public void givenGetCurrentDisplayPassedCoinCollectorWith4Quarters2Dimes2NickelsReturnsCorrectBalanceAsString() {
		CoinCollector testCollector = new CoinCollector();
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.NICKEL);
		testCollector.addCoin(Coin.NICKEL);
		
		Assert.assertEquals("Current Balance: $1.30", testDisplay.getCurrentDisplay(testCollector));
	}

}
