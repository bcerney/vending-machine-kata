package com.briancerney;

public class Display {

	public Display() {

	}

	public String getCurrentDisplay(CoinCollector currentCoins) {
		if (currentCoins.getNumberOfCoins() == 0) {
			return "INSERT COIN";
		}

	}

}
