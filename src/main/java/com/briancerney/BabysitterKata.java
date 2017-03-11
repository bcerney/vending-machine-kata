package com.briancerney;

public class BabysitterKata {
	private int startTime;
	private int bedtime;
	private int endTime;

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

	public int getEndTime() {
		return endTime;
	}

	public boolean isPastMidnight(int endTime) {
		return endTime >= 1 && endTime <= 4;
	}

	public boolean isValidEndTime(int endTime) {
		return (this.isPastMidnight(endTime) && startTime > 0) || 
				(endTime > startTime && startTime > 0);
	}

	public void setEndTime(int endTime) {
		if (this.isValidEndTime(endTime)) {
			this.endTime = endTime;
		}
	}

	public int calculateStartTimeToBedtimeInHours() {
		return bedtime - startTime;
	}

	public int calculateBedtimeToMidnightInHours() {
		return 12 - bedtime;
	}

}
