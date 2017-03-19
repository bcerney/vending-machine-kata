package com.briancerney;

import org.junit.Assert;
import org.junit.Test;

public class ChangeAmountTest {
	
	ChangeAmount testAmount;
	
	@Test
	public void givenChangeAmountZERO_CENTSGetTotalAmountInCentsReturns0() {
		testAmount = ChangeAmount.ZERO_CENTS;
		
		Assert.assertEquals(0, testAmount.getTotalAmountInCents());
	}
	
	@Test
	public void givenChangeAmountPassed100GetTotalAmountInCentsReturns100() {
		testAmount = new ChangeAmount(100);
		
		Assert.assertEquals(100, testAmount.getTotalAmountInCents());
	}
	
	@Test
	public void givenReturnChangeAmountOfCoinValuePassedQUARTERReturnsChangeAmount25Cents() {
		Coin testCoin = Coin.QUARTER;
		
		Assert.assertEquals(25, ChangeAmount.returnChangeAmountOfCoinValue(testCoin).getTotalAmountInCents());
	}
	
	@Test
	public void givenReturnChangeAmountOfCoinValuePassedDIMEReturnsChangeAmount10Cents() {
		Coin testCoin = Coin.QUARTER;
		
		Assert.assertEquals(25, ChangeAmount.returnChangeAmountOfCoinValue(testCoin).getTotalAmountInCents());
	}

}