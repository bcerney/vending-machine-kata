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
	public void setStartTimeFailsToSetStartTimeVariableIfPassed4() {
		int testStartTime = 4;
		babysitter.setStartTime(testStartTime);
		Assert.assertEquals(0, babysitter.getStartTime());;
	}
	
	@Test
	public void setStartTimeSuccessfullySetsStartTimeVariableIfPassed5() {
		int testStartTime = 5;
		babysitter.setStartTime(testStartTime);
		Assert.assertEquals(5, babysitter.getStartTime());;
	}
	
	@Test
	public void setStartTimeFailsToSetStartTimeVariableIfPassed12() {
		int testStartTime = 12;
		babysitter.setStartTime(testStartTime);
		Assert.assertEquals(0, babysitter.getStartTime());;
	}
	
	@Test
	public void isValidBedtimeReturnsFalseWhenPassedIntSmallerThanStartTime() {
		babysitter.setStartTime(6);
		Assert.assertFalse(babysitter.isValidBedtime(5));
	}
	
	@Test
	public void isValidBedtimeReturnsFalseWhenPassedIntGreaterThan11() {
		babysitter.setStartTime(6);
		Assert.assertFalse(babysitter.isValidBedtime(12));
	}
	
	
}
