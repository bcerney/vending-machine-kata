package com.briancerney;

import org.junit.Assert;
import org.junit.Test;



public class BabysitterKataTest {
	
	@Test
	public void isValidStartTimeReturnsFalseWhenPassed4() {
		BabysitterKata babysitter = new BabysitterKata();
		Assert.assertFalse(babysitter.isValidStartTime(4));
	}
	
	@Test
	public void isValidStartTimeReturnsTrueWhenPassed5() {
		BabysitterKata babysitter = new BabysitterKata();
		Assert.assertTrue(babysitter.isValidStartTime(5));
	}

}
