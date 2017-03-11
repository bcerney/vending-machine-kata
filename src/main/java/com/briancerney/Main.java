package com.briancerney;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		// input start time, confirm before 5:00pm and 12:00
		// input bedtime, confirm before Midnight
		// confirm end time, confirm before 4:00am
		// calculate pay for non-fractional hours
		Scanner input = new Scanner(System.in);
		BabysitterKata babysitter = new BabysitterKata();
		
		System.out.println();
		System.out.println("The Tyke-Squaters Society Tyke-Squatting Scheduling System");
		System.out.println();
		
		int startTime = 0;
		while (!babysitter.isValidStartTime(startTime)) {
			System.out.println("Please input a starting hour for your tyke-squater (5-12): ");
			startTime = Integer.parseInt(input.nextLine());
		}
		babysitter.setStartTime(startTime);
		
		int bedtime = 0;
		while (!babysitter.isValidBedtime(bedtime)) {
			System.out.println("Please input a bedtime for your tyke: ");
			bedtime = Integer.parseInt(input.nextLine());
		}
		babysitter.setBedtime(bedtime);
		
		int endTime = 0;
		while (!babysitter.isValidEndTime(endTime)) {
			System.out.println("Please input an ending hour for your tyke-squater: ");
			System.out.println("(No earlier than chosen starting hour, no later than 4)");
			endTime = Integer.parseInt(input.nextLine());
		}
		babysitter.setEndTime(endTime);
		
		int nightlyCharge = babysitter.calculateNightlyCharge();
		System.out.println("Total for tonight's tyke-squatting: $"+nightlyCharge+".00.");
		System.out.println("Thanks for choosing The Tyke-Squaters Society!");
	}

}
