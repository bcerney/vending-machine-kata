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
		Coin testCoin = Coin.DIME;
		
		Assert.assertEquals(10, ChangeAmount.returnChangeAmountOfCoinValue(testCoin).getTotalAmountInCents());
	}
	
	@Test
	public void givenReturnChangeAmountOfCoinValuePassedNICKELReturnsChangeAmount5Cents() {
		Coin testCoin = Coin.NICKEL;
		
		Assert.assertEquals(5, ChangeAmount.returnChangeAmountOfCoinValue(testCoin).getTotalAmountInCents());
	}
	
	@Test
	public void givenChangeAmountOfQUARTERPlusCoinAmountOfDIMEReturnsChangeAmountOf35Cents() {
		ChangeAmount quarterAmount = ChangeAmount.returnChangeAmountOfCoinValue(Coin.QUARTER);
		ChangeAmount dimeAmount = ChangeAmount.returnChangeAmountOfCoinValue(Coin.DIME);
		ChangeAmount quarterPlusDime = quarterAmount.plus(dimeAmount);
		
		Assert.assertEquals(35, quarterPlusDime.getTotalAmountInCents());
	}
	
	@Test
	public void givenChangeAmountOfNICEKLPlusCoinAmountOfDIMEReturnsChangeAmountOf15Cents() {
		ChangeAmount nickelAmount = ChangeAmount.returnChangeAmountOfCoinValue(Coin.NICKEL);
		ChangeAmount dimeAmount = ChangeAmount.returnChangeAmountOfCoinValue(Coin.DIME);
		ChangeAmount nickelPlusDime = nickelAmount.plus(dimeAmount);
		
		Assert.assertEquals(15, nickelPlusDime.getTotalAmountInCents());
	}
	
	@Test
	public void givenChangeAmount50CentsToStringReturnsCorrectly() {
		testAmount = new ChangeAmount(50);
		Assert.assertEquals("$0.50", testAmount.toString());
	}

}
