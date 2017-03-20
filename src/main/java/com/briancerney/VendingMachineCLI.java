package com.briancerney;

import java.util.Scanner;

public class VendingMachineCLI {
	private InsertCoinSlot insertCoinSlot;
	private Display display;
	private Scanner input;

	public VendingMachineCLI() {
		this.insertCoinSlot = new InsertCoinSlot();
		this.display = new Display();
		this.input = new Scanner(System.in);
	}

	public void start() {
		while (true) {
			printMenu();
			inputOption();
		}
	}

	private void printMenu() {
		System.out.println("Vending Machine");
		System.out.println(display.getCurrentDisplay(insertCoinSlot.getCoinCollector()));
		System.out.println("Please select an option: ");
		System.out.println("1) Insert Coins");
		System.out.println("2) Check Coin Return");
	}
	
	private void inputOption() {
		String choice = input.nextLine();
		if (choice.equals("1")) {
			insertCoin();
		} else if (choice.equals("2")) {
			checkCoinReturn();
		} else {
			System.out.println("Invalid input, please try again.");
		}
	}
	
	public void insertCoin() {
		System.out.println("Select coin to insert: ");
		System.out.println("1) Quarter");
		System.out.println("2) Dime");
		System.out.println("3) Nickel");
		System.out.println("4) Penny");
		
		String choice = input.nextLine();
		if (choice.equals("1")) {
			insertCoinSlot.insertCoin(Coin.QUARTER);
		} else if (choice.equals("2")) {
			insertCoinSlot.insertCoin(Coin.DIME);
		} else if (choice.equals("3")) {
			insertCoinSlot.insertCoin(Coin.NICKEL);
		} else if (choice.equals("4")) {
			insertCoinSlot.insertCoin(Coin.PENNY);
		} else {
			System.out.println("Invalid input, please try again.");
			System.out.println("================================");
		}

	}
	
	public void checkCoinReturn() {
		
	}
}
