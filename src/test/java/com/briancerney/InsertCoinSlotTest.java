package com.briancerney;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InsertCoinSlotTest {
	InsertCoinSlot testInsert;
	
	@Before
	public void setUp() {
		testInsert = new InsertCoinSlot();
	}
	
	@Test
	public void givenInsertCoinPassedQuarterCurrentBalanceCoinsAddsQuarter() {
		testInsert.insertCoin(Coin.QUARTER);
		
		Assert.assertEquals(1, testInsert.getNumberOfCurrentBalanceCoins());
		Assert.assertEquals(0, testInsert.getNumberOfReturnedCoins());
	}

}
