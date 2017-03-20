package com.briancerney;

public class Display {
	private Transaction transaction;

	public Display() {
		this.transaction = new Transaction();
	}
	
	private String displayBalance(CoinCollector currentCoins) {
		return "Current Balance: " + transaction.calculateChangeAmount(currentCoins).toString();
	}

	public String getCurrentDisplay(CoinCollector currentCoins) {
		if (currentCoins.getNumberOfCoins() == 0) {
			return "INSERT COIN";
		}
		return displayBalance(currentCoins);
	}

}
