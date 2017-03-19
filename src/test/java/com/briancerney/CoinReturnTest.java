package com.briancerney;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoinReturnTest {
	CoinReturn testReturn;

	@Before
	public void setUp() {
		testReturn = new CoinReturn();
	}

	@Test
	public void givenAddCoinPassedPennyCoinReturnAddsPenny() {
		// TODO: logic shouldn't be in test, consider creating class 
		// to house both CoinCollector and CoinReturn
//		CoinCollector testCollect = new CoinCollector();
//		Coin testPenny = Coin.PENNY;
//		boolean addTest = testCollect.addCoin(testPenny);
//		if (!addTest) {testReturn.addCoin(testPenny);}
//		List<Coin> coinsReturned = testReturn.getReturnedCoins();
//		Coin shouldBePenny = coinsReturned.get(0);
//		
//		
//		Assert.assertEquals(1, testReturn.getNumberOfCoins());
//		Assert.assertEquals(Coin.PENNY, shouldBePenny);
	}

}
