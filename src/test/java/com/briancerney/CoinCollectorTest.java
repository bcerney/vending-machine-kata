package com.briancerney;

import java.util.List;

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
	public void givenCoinCollectorNumberOfCoinsReturns3AfterClearCoinCollectorCalledNumberOfCoinsReturns0() {
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.NICKEL);
		testCollector.clearCoinCollector();
		
		Assert.assertEquals(0, testCollector.getNumberOfCoins());
	}
	
	@Test
	public void givenAddCoinNICKELAndDIMEAndQUARTERSortCoinsByHighestValueCorrectlyReorders() {
		
		testCollector.addCoin(Coin.NICKEL);
		testCollector.addCoin(Coin.DIME);		
		testCollector.addCoin(Coin.QUARTER);
		testCollector.sortCoinsByHighestValue();
		List<Coin> testCollectorList = testCollector.getCoinsAsList();
		
		Assert.assertEquals(Coin.QUARTER, testCollectorList.get(0));
		Assert.assertEquals(Coin.DIME, testCollectorList.get(1));
		Assert.assertEquals(Coin.NICKEL, testCollectorList.get(2));
	}

}
