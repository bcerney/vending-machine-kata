package com.briancerney;

public class Display {
	private BalanceCalculator balanceCalculator;

	public Display() {

	}
	
	private String displayBalance(CoinCollector currentCoins) {
		return "Current Balance: " + balanceCalculator.calculateBalance(currentCoins);
	}

	public String getCurrentDisplay(CoinCollector currentCoins) {
		if (currentCoins.getNumberOfCoins() == 0) {
			return "INSERT COIN";
		}
		return displayBalance(currentCoins);
	}

}
