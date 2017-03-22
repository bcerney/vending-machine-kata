package com.briancerney;

public class Display {
	private InsertCoinSlot coinSlot;
	private Transaction transaction;
	private int displayCode;

	public Display(InsertCoinSlot coinSlot, Transaction transaction) {
		this.coinSlot = coinSlot;
		this.transaction = transaction;
		this.displayCode = 1;
	}
	
	private String displayBalance(CoinCollector currentCoins) {
		return "Current Balance: " + transaction.calculateChangeAmount(currentCoins).toString();
	}
	
	public void setDisplayCode(int displayCode) {
		this.displayCode = displayCode;
	}
	
	public String getDisplay() {
		if (displayCode == 1) {
			return getBalanceDisplay();
		} else if (displayCode == 2) {
			return "PRICE";
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
