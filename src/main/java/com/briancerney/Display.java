package com.briancerney;

public class Display {
	private BalanceCalculator balanceCalculator;

	public Display() {
		this.balanceCalculator = new BalanceCalculator();
	}
	
	private String displayBalance(CoinCollector currentCoins) {
		return "Current Balance: " + balanceCalculator.calculateBalance(currentCoins).toString();
	}

	public String getCurrentDisplay(CoinCollector currentCoins) {
		if (currentCoins.getNumberOfCoins() == 0) {
			return "INSERT COIN";
		}
		return displayBalance(currentCoins);
	}

}
