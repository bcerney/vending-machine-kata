package com.briancerney;

public class BabysitterKata {
	private int startTime;

	public BabysitterKata() {
	}

	public int getStartTime() {
		return startTime;
	}
	
	public boolean isValidStartTime(int startHour) {
		return startHour >= 5 && startHour < 12;
	}

	public void setStartTime(int startTime) {
		if (isValidStartTime(startTime)) {
			this.startTime = startTime;
		}
	}
	
	public boolean isValidBedtime(int bedtime) {
		return bedtime >= startTime && bedtime < 12;
	}

}
