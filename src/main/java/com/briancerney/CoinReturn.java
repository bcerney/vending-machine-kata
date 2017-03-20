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
	
	private int getNumberOfPennies() {
		int numberOfPennies = 0;
		
		for (Coin coin : returnedCoins) {
			if (coin.equals(Coin.PENNY)) {
				numberOfPennies++;
			}
		}
		return numberOfPennies;
	}

	private String getNumberOfPenniesString() {
		int numberOfPennies = getNumberOfPennies();
		if (numberOfPennies == 0) {
			return "0 pennies";
		} else if (numberOfPennies == 1) {
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
