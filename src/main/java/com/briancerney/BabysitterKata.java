package com.briancerney;

public class BabysitterKata {
	private int startTime;

	public BabysitterKata() {
	}

	public boolean isValidStartTime(int startHour) {
		return startHour >= 5 && startHour < 12;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		if (isValidStartTime(startTime)) {
			this.startTime = startTime;
		}
	}

}
