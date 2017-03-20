package com.briancerney;

import java.util.Scanner;

public class VendingMachineCLI {
	private InsertCoinSlot insertCoinSlot;
	private Display display;
	private Scanner input;
	private Inventory inventory;

	public VendingMachineCLI() {
		this.insertCoinSlot = new InsertCoinSlot();
		this.display = new Display();
		this.input = new Scanner(System.in);
		this.inventory = new Inventory();
	}

	public void start() {
		stockInventory();
		while (true) {
			printMenu();
			inputOption();
		}
	}
	
	private void stockInventory() {
		inventory.addProduct(1, new Product("Cola", new ChangeAmount(100), 3));
		inventory.addProduct(2, new Product("Chips", new ChangeAmount(50), 3));
		inventory.addProduct(3, new Product("Candy", new ChangeAmount(65), 3));
	}

	private void printMenu() {
		System.out.println("Vending Machine");
		System.out.println(display.getCurrentDisplay(insertCoinSlot.getCoinCollector()));
		System.out.println("Please select an option: ");
		System.out.println("1) Insert Coins");
		System.out.println("2) Select Product");
		System.out.println("3) Check Coin Return");
	}
	
	private void inputOption() {
		String choice = input.nextLine();
		if (choice.equals("1")) {
			insertCoin();
		} else if (choice.equals("2")) {
			selectProduct();
		} else if (choice.equals("3")) {
			checkCoinReturn();
		}else {
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
	
	public void selectProduct() {
		
	}
	
	public void checkCoinReturn() {
		
	}
}
