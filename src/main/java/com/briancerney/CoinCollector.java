package com.briancerney;

import java.util.ArrayList;
import java.util.List;

public class CoinCollector {
	private List<Coin> currentCoins;

	public CoinCollector() {
		this.currentCoins = new ArrayList<Coin>();
	}
	
	private boolean isValidCoin(Coin coin) {
		return coin.equals(Coin.QUARTER) ||
				coin.equals(Coin.DIME) ||
				coin.equals(Coin.NICKEL);
	}

	public boolean addCoin(Coin coinToAdd) {
		if (isValidCoin(coinToAdd)) {
			currentCoins.add(coinToAdd);
			return true;
		}
		return false;
	}

	public int getNumberOfCoins() {
		return currentCoins.size();
	}
}
