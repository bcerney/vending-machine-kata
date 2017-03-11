package com.briancerney;

public class BabysitterKata {
	
	public BabysitterKata() {
		
	}
	
	public boolean isValidStartTime(int startHour) {
		return startHour >= 5 && startHour < 12;
	}

}
