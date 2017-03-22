package com.briancerney;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TransactionTest {
	
	Transaction testTransaction;
	
	@Before
	public void setUp() {
		testTransaction = new Transaction();
	}
	
	@Test
	public void givenCoinCollectorContains1QuarterCalculateChangeAmountReturnsChangeAmountOf25() {
		CoinCollector testCollector = new CoinCollector();
		testCollector.addCoin(Coin.QUARTER);
		ChangeAmount testAmount = testTransaction.calculateChangeAmount(testCollector);
		
		Assert.assertEquals(25, testAmount.getTotalAmountInCents());
	}
	
	@Test
	public void givenCoinCollectorContains2Quarters2Dimes2NickelsCalculateChangeAmountReturnsChangeAmountOf80() {
		CoinCollector testCollector = new CoinCollector();
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.DIME);
		testCollector.addCoin(Coin.NICKEL);
		testCollector.addCoin(Coin.NICKEL);

		ChangeAmount testAmount = testTransaction.calculateChangeAmount(testCollector);
		
		Assert.assertEquals(80, testAmount.getTotalAmountInCents());
	}
	
	@Test
	public void givenPriceInCents100AndSortedCoins4QuartersCanMakeChangeReturnTrue() {
		CoinCollector testCollector = new CoinCollector();
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.sortCoinsByHighestValue();
		List<Coin> testList = testCollector.getCoinsAsList();
		
		Assert.assertTrue(testTransaction.canMakeChange(100, testList));
	}
	
	@Test
	public void givenPriceInCents70AndSortedCoins3QuartersCanMakeChangeReturnFalse() {
		CoinCollector testCollector = new CoinCollector();
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.addCoin(Coin.QUARTER);
		testCollector.sortCoinsByHighestValue();
		List<Coin> testList = testCollector.getCoinsAsList();
		
		Assert.assertFalse(testTransaction.canMakeChange(70, testList));
	}

}
