package com.briancerney;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoinCollector implements CoinCollection {
	private List<Coin> currentCoins;

	public CoinCollector() {
		this.currentCoins = new ArrayList<Coin>();
	}

	public List<Coin> getCoinsAsList() {
		return currentCoins;
	}

	public void sortCoinsByHighestValue() {
		Collections.sort(currentCoins);
	}

	public void addCoin(Coin coinToAdd) {
		currentCoins.add(coinToAdd);
	}

	public int getNumberOfCoins() {
		return currentCoins.size();
	}

	public void clearCoinCollector() {
		currentCoins.clear();
	}
}
