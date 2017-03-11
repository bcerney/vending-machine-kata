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
	public void isValidBedtimeReturnsFalseWhenPassedIntGreaterThan12() {
		babysitter.setStartTime(6);
		Assert.assertFalse(babysitter.isValidBedtime(13));
	}
	
	@Test
	public void isValidBedtimeReturnsTrueWhenPassed12AndStartTimeSetTo5() {
		babysitter.setStartTime(5);
		Assert.assertTrue(babysitter.isValidBedtime(12));
	}
	
	@Test
	public void setBedtimeFailsToSetBedtimeVariableIfStartTimeNotSet() {
		int testBedime = 8;
		babysitter.setBedtime(testBedime);
		Assert.assertEquals(0, babysitter.getBedtime());;
	}
	
	@Test
	public void setBedtimeFailsToSetBedtimeVariableIfPassed5AndStartTimeSetTo6() {
		babysitter.setStartTime(6);
		int testBedime = 5;
		babysitter.setBedtime(testBedime);
		Assert.assertEquals(0, babysitter.getBedtime());;
	}
	
	@Test
	public void setBedtimeSuccessfullySetsBedtimeVariableIfPassed12AndStartTimeSetTo5() {
		babysitter.setStartTime(5);
		int testBedime = 12;
		babysitter.setBedtime(testBedime);
		Assert.assertEquals(12, babysitter.getBedtime());;
	}
	
	@Test
	public void calculateStartTimeToBedtimeInHoursReturns4WhenStartTimeIs6AndBedtimeIs10() {
		babysitter.setStartTime(6);
		babysitter.setBedtime(10);
		Assert.assertEquals(4, babysitter.calculateStartTimeToBedtimeInHours());;
	}
	
	
}
