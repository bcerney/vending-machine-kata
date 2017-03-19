package com.briancerney;

import java.util.ArrayList;
import java.util.List;

public class CoinCollector implements CoinCollection {
	private List<Coin> currentCoins;

	public CoinCollector() {
		this.currentCoins = new ArrayList<Coin>();
	}
	
	public List<Coin> getCoinsAsList() {
		return currentCoins;
	}
	
	public boolean isValidCoin(Coin coin) {
		return coin.equals(Coin.QUARTER) ||
				coin.equals(Coin.DIME) ||
				coin.equals(Coin.NICKEL);
	}

	public void addCoin(Coin coinToAdd) {
		if (isValidCoin(coinToAdd)) {
			currentCoins.add(coinToAdd);
		}
	}

	public int getNumberOfCoins() {
		return currentCoins.size();
	}
}
