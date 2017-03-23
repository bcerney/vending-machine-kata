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

	private String getNumberOfPenniesString() {
		int numberOfPennies = getNumberOfPennies();
		
		if (numberOfPennies == 1) {
			return "1 penny";
		} else {
			return numberOfPennies+" pennies";
		}
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
	
	private String getNumberOfNickelsString() {
		int numberOfNickels = getNumberOfNickels();
		
		if (numberOfNickels == 1) {
			return "1 nickel";
		} else {
			return numberOfNickels+" nickels";
		}
	}
	
	private int getNumberOfNickels() {
		int numberOfNickels = 0;
		
		for (Coin coin : returnedCoins) {
			if (coin.equals(Coin.NICKEL)) {
				numberOfNickels++;
			}
		}
		return numberOfNickels;
	}
	
	private String getNumberOfDimesString() {
		int numberOfDimes = getNumberOfDimes();
		
		if (numberOfDimes == 1) {
			return "1 dimes";
		} else {
			return numberOfDimes+" dimes";
		}
	}
	
	private int getNumberOfDimes() {
		int numberOfDimes = 0;
		
		for (Coin coin : returnedCoins) {
			if (coin.equals(Coin.DIME)) {
				numberOfDimes++;
			}
		}
		return numberOfDimes;
	}


	@Override
	public String toString() {
		if (returnedCoins.isEmpty()) {
			return "The coin return is empty!";
		}
		String pennyCount = getNumberOfPenniesString();
		String nickelCount = getNumberOfNickelsString();
		String dimeCount = getNumberOfDimesString();
		
		return "Coin return contains: 0 quarters, "+dimeCount+", "+nickelCount+", "+pennyCount;
	}

}
