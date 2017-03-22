package com.briancerney;

public class Display {
	private InsertCoinSlot coinSlot;
	private Transaction transaction;
	private String displayStatus;

	public Display(InsertCoinSlot coinSlot, Transaction transaction) {
		this.coinSlot = coinSlot;
		this.transaction = transaction;
		this.displayStatus = "displayBalance";
	}
	
	private String displayBalance(CoinCollector currentCoins) {
		return "Current Balance: " + transaction.calculateChangeAmount(currentCoins).toString();
	}
	
	public void setDisplayStatus(String displayStatus) {
		this.displayStatus = displayStatus;
	}
	
	public String getDisplay() {
		if (displayStatus == "displayBalance") {
			return getBalanceDisplay();
		} else if (displayStatus == "insufficientBalance") {
			return "PRICE";
		} else if (displayStatus == "productSoldOut") {
			return "SOLD OUT";
		} else if (displayStatus == "needExactChange") {
			return "EXACT CHANGE ONLY";
		} else if (displayStatus == "productSold") {
			return "THANK YOU";
		} else {
			return "UNKNOWN DISPLAY STATUS";
		}
	}

	public String getBalanceDisplay() {
		CoinCollector currentCoins = coinSlot.getCurrentBalance();
		if (currentCoins.getNumberOfCoins() == 0) {
			return "INSERT COIN";
		}
		return displayBalance(currentCoins);
	}

}
