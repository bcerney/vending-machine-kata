package com.briancerney;

import java.util.ArrayList;
import java.util.List;

public class CoinReturn implements CoinCollection {
	private List<Coin> returnedCoins;

	public CoinReturn() {
		this.returnedCoins = new ArrayList<Coin>();
	}

	public List<Coin> getCoinsAsList() {
		return returnedCoins;
	}

	public void addCoin(Coin coinToAdd) {
		returnedCoins.add(coinToAdd);
	}

	public int getNumberOfCoins() {
		return returnedCoins.size();
	}

	public String getNumberOfPenniesString() {
		if (!returnedCoins.contains(Coin.PENNY)) {
			return "0 pennies";
		}
		
		int numberOfPennies = 0;
		for (Coin coin : returnedCoins) {
			if (coin.equals(Coin.PENNY)) {
				numberOfPennies++;
			}
		}
		
		if (numberOfPennies == 1) {
			return "1 penny";
		} else {
			return numberOfPennies+" pennies";
		}
	}


	@Override
	public String toString() {
		if (returnedCoins.isEmpty()) {
			return "The coin return is empty!";
		}
		String pennyCount = getNumberOfPenniesString();
		
		return "Coin return contains: 0 quarters, 0 dimes, 0 nickels, "+pennyCount;
	}

}
