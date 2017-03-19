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
	
	@Test
	public void givenInsertCoinPassedQuarterDimeNickelAndPennyCurrentBalanceSizeIs3ReturnedCoinsSizeIs0() {
		testInsert.insertCoin(Coin.QUARTER);
		testInsert.insertCoin(Coin.DIME);
		testInsert.insertCoin(Coin.NICKEL);
		testInsert.insertCoin(Coin.PENNY);
		
		Assert.assertEquals(3, testInsert.getNumberOfCurrentBalanceCoins());
		Assert.assertEquals(1, testInsert.getNumberOfReturnedCoins());
	}

}
