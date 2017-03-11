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
		Assert.assertEquals(0, babysitter.getStartTime());
	}
	
	@Test
	public void setStartTimeSuccessfullySetsStartTimeVariableIfPassed5() {
		int testStartTime = 5;
		babysitter.setStartTime(testStartTime);
		Assert.assertEquals(5, babysitter.getStartTime());
	}
	
	@Test
	public void setStartTimeFailsToSetStartTimeVariableIfPassed12() {
		int testStartTime = 12;
		babysitter.setStartTime(testStartTime);
		Assert.assertEquals(0, babysitter.getStartTime());
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
		Assert.assertEquals(0, babysitter.getBedtime());
	}
	
	@Test
	public void setBedtimeFailsToSetBedtimeVariableIfPassed5AndStartTimeSetTo6() {
		babysitter.setStartTime(6);
		int testBedime = 5;
		babysitter.setBedtime(testBedime);
		Assert.assertEquals(0, babysitter.getBedtime());
	}
	
	@Test
	public void setBedtimeSuccessfullySetsBedtimeVariableIfPassed12AndStartTimeSetTo5() {
		babysitter.setStartTime(5);
		int testBedime = 12;
		babysitter.setBedtime(testBedime);
		Assert.assertEquals(12, babysitter.getBedtime());
	}
	
	@Test
	public void calculateStartTimeToBedtimeInHoursReturns4WhenStartTimeIs6AndBedtimeIs10() {
		babysitter.setStartTime(6);
		babysitter.setBedtime(10);
		Assert.assertEquals(4, babysitter.calculateStartTimeToBedtimeInHours());
	}
	
	@Test
	public void calculateBedtimeToMidnightInHoursReturns2WhenStartTimeIs6AndBedtimeIs10() {
		babysitter.setStartTime(6);
		babysitter.setBedtime(10);
		Assert.assertEquals(2, babysitter.calculateBedtimeToMidnightInHours());
	}
	
	@Test
	public void isValidEndTimeReturnsFalseWhenPassed5() {
		Assert.assertFalse(babysitter.isValidEndTime(5));
	}
	
	@Test
	public void isValidEndTimeReturnsFalseWhenPassed6AndStartTimeIs7() {
		babysitter.setStartTime(7);
		babysitter.setBedtime(8);
		Assert.assertFalse(babysitter.isValidEndTime(6));
	}
	
	@Test
	public void isValidEndTimeReturnsTrueWhenPassed8AndStartTimeIs5() {
		babysitter.setStartTime(5);
		babysitter.setBedtime(7);
		Assert.assertTrue(babysitter.isValidEndTime(8));
	}
	
	@Test
	public void isValidEndTimeReturnsTrueWhenPassed4AndStartTimeIs5() {
		babysitter.setStartTime(5);
		babysitter.setBedtime(10);
		Assert.assertTrue(babysitter.isValidEndTime(4));
	}
	
	@Test
	public void setEndTimeFailsToSetEndTimeVariableIfStartTimeIsNotSet() {
		babysitter.setEndTime(5);
		Assert.assertEquals(0, babysitter.getEndTime());
	}
	
	@Test
	public void setEndTimeFailsToSetEndTimeVariableIfPassedInvalidEndTime() {
		babysitter.setStartTime(6);
		babysitter.setEndTime(5);
		Assert.assertEquals(0, babysitter.getEndTime());
	}
	
	@Test
	public void setEndTimeSuccessfullySetsEndTimeVariableIfPassed12AndStartTimeIs5() {
		babysitter.setStartTime(5);
		babysitter.setBedtime(10);
		babysitter.setEndTime(12);
		Assert.assertEquals(12, babysitter.getEndTime());
	}
	
	@Test
	public void setEndTimeSuccessfullySetsEndTimeVariableIfPassed4AndStartTimeIs5() {
		babysitter.setStartTime(5);
		babysitter.setBedtime(10);
		babysitter.setEndTime(4);
		Assert.assertEquals(4, babysitter.getEndTime());
	}
	
	@Test
	public void calculateBedtimeToEndTimeInHoursReturns3fStartTimeIs5BedtimeIs9EndTimeIs12() {
		babysitter.setStartTime(5);
		babysitter.setBedtime(9);
		babysitter.setEndTime(12);
		Assert.assertEquals(3, babysitter.calculateBedtimeToEndTimeInHours());
	}
	
	@Test
	public void calculateBedtimeToEndTimeInHoursReturns0fStartTimeIs5BedtimeIs9EndTimeIs4() {
		babysitter.setStartTime(5);
		babysitter.setBedtime(9);
		babysitter.setEndTime(4);
		Assert.assertEquals(0, babysitter.calculateBedtimeToEndTimeInHours());
	}
	
//	@Test
	public void calculateNightlyChargeReturns20IfStartTimeIs5BedtimeIs6EndTimeIs7() {
		babysitter.setStartTime(5);
		babysitter.setBedtime(6);
		babysitter.setEndTime(7);
		Assert.assertEquals(20, babysitter.calculateNightlyCharge());
	}
}
