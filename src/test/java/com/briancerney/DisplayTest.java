package com.briancerney;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisplayTest {
	Display testDisplay;
	Transaction testTrans;
	InsertCoinSlot testSlot;
	
	@Before
	public void setUp() {
		testTrans = new Transaction();
		testSlot = new InsertCoinSlot();
		testDisplay = new Display(testSlot, testTrans);
	}
	
	@Test
	public void givenDisplayCode1AndCurrentCoins0GetDisplayReturnsINSERTCOIN() {
		
		
		Assert.assertEquals("INSERT COIN", testDisplay.getDisplay());
	}
	
	@Test
	public void givenCurrentBalanceAdd1QuarterGetDisplayReturnsCorrectBalanceAsString() {
		testSlot.getCurrentBalance().addCoin(Coin.QUARTER);
		
		Assert.assertEquals("Current Balance: $0.25", testDisplay.getDisplay());
	}
	
	@Test
	public void givenCurrentBalanceAdd2Quarters2Dimes2NickelsGetDisplayReturnsCorrectBalanceAsString() {
		CoinCollector testCollector = testSlot.getCurrentBalance();
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.NICKEL);
		testCollector.addCoin(Coin.NICKEL);
		
		Assert.assertEquals("Current Balance: $0.80", testDisplay.getDisplay());
	}
	
	@Test
	public void givenGetCurrentDisplayPassedCoinCollectorWith4Quarters2Dimes2NickelsReturnsCorrectBalanceAsString() {
		CoinCollector testCollector = testSlot.getCurrentBalance();
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.NICKEL);
		testCollector.addCoin(Coin.NICKEL);
		
		Assert.assertEquals("Current Balance: $1.30", testDisplay.getDisplay());
	}
	
	@Test
	public void givenSetDisplayCodeTo2GetDisplayReturnsPRICEString() {
		testDisplay.setDisplayCode(2);
		
		Assert.assertEquals("PRICE", testDisplay.getDisplay());
	}

}
