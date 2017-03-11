package com.briancerney;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class BabysitterKataTest {
	BabysitterKata babysitter;
	
	@Before
	public void setUp() {
		babysitter = new BabysitterKata();
	}
	
	@Test
	public void isValidStartTimeReturnsFalseWhenPassed4() {
		
		Assert.assertFalse(babysitter.isValidStartTime(4));
	}
	
	@Test
	public void isValidStartTimeReturnsTrueWhenPassed5() {
		Assert.assertTrue(babysitter.isValidStartTime(5));
	}
	
	@Test
	public void isValidStartTimeReturnsFalseWhenPassed12() {
		Assert.assertFalse(babysitter.isValidStartTime(12));
	}
	
	@Test
	public void setStartTimeSuccessfullySetsStartTimeVariable() {
		int testStartTime = 5;
		babysitter.setStartTime(testStartTime);
		Assert.assertEquals(5, babysitter.getStartTime());;
	}

}
