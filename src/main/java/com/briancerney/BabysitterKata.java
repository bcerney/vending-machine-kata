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

	public boolean startTimeAndBedtimeAreSet() {
		return startTime > 0 && bedtime > 0;
	}

	public boolean isValidEndTime(int endTime) {
		return (this.isPastMidnight(endTime) && this.startTimeAndBedtimeAreSet())
				|| (endTime > startTime && this.startTimeAndBedtimeAreSet());
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

	public int calculateBedtimeToEndTimeInHours() {
		if (!this.isPastMidnight(endTime)) {
			return endTime - bedtime;
		}
		return 0;
	}

	public int getNumberOfHoursPastMidnight() {
		// endTime value can double as number of hours past midnight
		if (this.isPastMidnight(endTime)) {
			return endTime;
		}
		return 0;
	}
	
	public int startTimeToBedtimeCharge() {
		return calculateStartTimeToBedtimeInHours() * 12;
	}
	
	public int bedtimeToEndTimeCharge() {
		if (this.isPastMidnight(endTime)) {
			return (calculateBedtimeToMidnightInHours() * 8) +
					(getNumberOfHoursPastMidnight() * 16);
		} else {
			return calculateBedtimeToEndTimeInHours() * 8;
		}
	}

	public int calculateNightlyCharge() {
		return startTimeToBedtimeCharge() + bedtimeToEndTimeCharge();
	}

}
