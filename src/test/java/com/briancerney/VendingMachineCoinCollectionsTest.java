package com.briancerney;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineCoinCollectionsTest {
	VendingMachineCoinCollections testCollections;
	
	@Before
	public void setUp() {
		testCollections = new VendingMachineCoinCollections();
	}
	
	@Test
	public void givenInsertCoinPassedQuarterCurrentBalanceCoinsAddsQuarter() {
		testCollections.insertCoin(Coin.QUARTER);
		
		Assert.assertEquals(1, testCollections.getNumberOfCurrentBalanceCoins());
		Assert.assertEquals(0, testCollections.getNumberOfReturnedCoins());
	}

}
