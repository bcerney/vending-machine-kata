package com.briancerney;

import org.junit.Assert;
import org.junit.Test;



public class BabysitterKataTest {
	
	@Test
	public void isValidStartTimeReturnsFalseWhenPassed4() {
		BabysitterKata babysitter = new BabysitterKata();
		Assert.assertFalse(babysitter.isValidStartTime(4));
	}

}
