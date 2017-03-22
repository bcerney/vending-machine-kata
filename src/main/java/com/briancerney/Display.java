package com.briancerney;

public class Display {
	private InsertCoinSlot coinSlot;
	private Transaction transaction;
	private String displayStatus;

	public Display(InsertCoinSlot coinSlot, Transaction transaction) {
		this.coinSlot = coinSlot;
		this.transaction = transaction;
		this.displayStatus = "showBalance";
	}
	
	private String displayBalance(CoinCollector currentCoins) {
		return "Current Balance: " + transaction.calculateChangeAmount(currentCoins).toString();
	}
	
	public void setDisplayStatus(String displayCode) {
		this.displayStatus = displayCode;
	}
	
	public String getDisplay() {
		if (displayStatus == "showBalance") {
			return getBalanceDisplay();
		} else if (displayStatus == "insufficientBalance") {
			return "PRICE";
		} else if (displayStatus == "productSoldOut") {
			return "SOLD OUT";
		}
		return "";
	}

	public String getBalanceDisplay() {
		CoinCollector currentCoins = coinSlot.getCurrentBalance();
		if (currentCoins.getNumberOfCoins() == 0) {
			return "INSERT COIN";
		}
		return displayBalance(currentCoins);
	}

}
