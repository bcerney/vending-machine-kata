package com.briancerney;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisplayTest {
	Display testDisplay;
	
	@Before
	public void setUp() {
		testDisplay = new Display();
	}
	
	@Test
	public void givenGetCurrentDisplayPassedCoinCollectorSize0ReturnsINSERTCOIN() {
		CoinCollector testCollector = new CoinCollector();
		
		Assert.assertEquals("INSERT COIN", testDisplay.getCurrentDisplay(testCollector));
	}

}
