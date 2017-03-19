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

}
