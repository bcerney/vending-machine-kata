package com.briancerney;

import java.util.Scanner;

public class VendingMachineCLI {
	private InsertCoinSlot insertCoinSlot;
	private Display display;
	private Scanner input;
	private Inventory inventory;
	private Transaction transaction;

	public VendingMachineCLI() {
		this.input = new Scanner(System.in);
		this.inventory = new Inventory();
		this.insertCoinSlot = new InsertCoinSlot();
		this.transaction = new Transaction();
		this.display = new Display(insertCoinSlot, transaction);
	}

	public void start() {
		stockInventory();
		
		while (true) {
			printMenu();
			inputOption();
		}
	}
	
	private void stockInventory() {
		inventory.addProduct(1, new Product("Cola", new ChangeAmount(100), 1));
		inventory.addProduct(2, new Product("Chips", new ChangeAmount(50), 1));
		inventory.addProduct(3, new Product("Candy", new ChangeAmount(65), 1));
	}

	private void printMenu() {
		System.out.println("Vending Machine");
		System.out.println(display.getDisplay());
		System.out.println("Please select an option: ");
		System.out.println("1) Insert Coins");
		System.out.println("2) Select Product");
		System.out.println("3) Return Coins");
		System.out.println("4) Check Coin Return");
		System.out.println("Q) Quit");
	}
	
	private void inputOption() {
		String choice = input.nextLine();
		if (choice.equals("1")) {
			insertCoin();
		} else if (choice.equals("2")) {
			selectProduct();
		} else if (choice.equals("3")) {
			pressReturnCoins();
		} else if (choice.equals("4")) {
			checkCoinReturn();
		} else if (choice.equals("5")) {
			System.exit(1);;
		} else {
			System.out.println("Invalid input, please try again.");
		}
	}
	
	private void insertCoin() {
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
		
		display.setDisplayStatus("displayBalance");
	}
	
	private void selectProduct() {
		System.out.println("Please select a product:");
		displayInventory();
		
		int choice = Integer.parseInt(input.nextLine());
		if (isValidChoice(choice)) {
			attemptPurchaseOfProduct(choice);
		} else {
			System.out.println("Invalid choice, please try again");
		}
	}
	
	private void displayInventory() {
		for (int key = 1; key <= inventory.getNumberOfProducts(); key++) {
			Product nextProduct = inventory.getProductBySlotKey(key);
			System.out.println(key+") "+nextProduct.toString());
		}
	}
	
	boolean isValidChoice(int choice) {
		return choice >=1 && choice <= 3;
	}
	
	void attemptPurchaseOfProduct(int choice) {
		Product selectedProduct = inventory.getProductBySlotKey(choice);
		ChangeAmount currentBalance = transaction.calculateChangeAmount(insertCoinSlot.getCurrentBalance());
		ChangeAmount productPrice = selectedProduct.getPrice();
		
		if (currentBalance.isGreaterThanOrEqualTo(productPrice) &&
			selectedProduct.isInStock()) {
			boolean isSuccessful = transaction.attemptPurchase(productPrice, insertCoinSlot);
			if (isSuccessful) {
				inventory.dispenseProduct(choice);
				display.setDisplayStatus("THANK YOU");
			} else {
				display.setDisplayStatus("EXACT CHANGE ONLY");
			}
		} else if (!currentBalance.isGreaterThanOrEqualTo(productPrice)) {
			display.setDisplayStatus("PRICE");
		} else if (!selectedProduct.isInStock()) {
			display.setDisplayStatus("SOLD OUT");
		}
	}
	
	private void pressReturnCoins() {
		insertCoinSlot.returnCoins();
		display.setDisplayStatus("displayBalance");
	}
	
	private void checkCoinReturn() {
		System.out.println(insertCoinSlot.getCoinReturn().toString());
		System.out.println("=======================================");
		display.setDisplayStatus("displayBalance");
	}
}
