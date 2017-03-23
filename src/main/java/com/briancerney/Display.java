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
	
	public void setDisplayStatus(String displayStatus) {
		this.displayStatus = displayStatus;
	}
	
	public String getDisplay() {
		if (displayStatus == "displayBalance") {
			return getBalanceDisplay();
		} else {
			return displayStatus;
		} 
	}

	public String getBalanceDisplay() {
		CoinCollector currentCoins = coinSlot.getCurrentBalance();
		if (currentCoins.getNumberOfCoins() == 0) {
			return "INSERT COIN";
		}
		return displayBalance(currentCoins);
	}
	
	private String displayBalance(CoinCollector currentCoins) {
		return transaction.calculateChangeAmount(currentCoins).toString();
	}

}
