package com.briancerney;

import java.util.ArrayList;
import java.util.List;

public class CoinCollector {
	private List<Coin> currentCoins;
	
	public CoinCollector() {
		this.currentCoins = new ArrayList<Coin>();
	}
	
	public void addCoin(Coin coinToAdd) {
		currentCoins.add(coinToAdd);
	}
	
	public int getNumberOfCoins() {
		return currentCoins.size();
	}
}
