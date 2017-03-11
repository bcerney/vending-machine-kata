package com.briancerney;

public class BabysitterKata {
	private int startTime;
	private int bedtime;

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

	public int getBedtime() {
		return bedtime;
	}

	public boolean isValidBedtime(int bedtime) {
		return bedtime >= startTime && bedtime < 13;
	}

	public void setBedtime(int bedtime) {
		if (startTime > 0 && isValidBedtime(bedtime)) {
			this.bedtime = bedtime;
		}
	}
	
	public boolean isValidEndTime(int endTime) {
		return false;
	}
	
	public int calculateStartTimeToBedtimeInHours() {
		return bedtime - startTime;
	}
	
	public int calculateBedtimeToMidnightInHours() {
		return 12 - bedtime;
	}

}
