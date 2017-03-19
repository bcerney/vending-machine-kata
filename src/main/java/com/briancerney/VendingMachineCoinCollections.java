package com.briancerney;

import java.util.List;

public class VendingMachineCoinCollections {
	private CoinCollector currentBalanceCoins;
	private CoinReturn returnedCoins;
	
	public VendingMachineCoinCollections() {
		this.currentBalanceCoins = new CoinCollector();
		this.returnedCoins = new CoinReturn();
	}
	
	private boolean isValidCoin(Coin coin) {
		return coin.equals(Coin.QUARTER) ||
				coin.equals(Coin.DIME) ||
				coin.equals(Coin.NICKEL);
	}
	
	public void insertCoin(Coin coinToAdd) {
		if (isValidCoin(coinToAdd)) {
			currentBalanceCoins.addCoin(coinToAdd);
		} else {
			returnedCoins.addCoin(coinToAdd);
		}
	}
	
	public List<Coin> getCurrentBalanceCoins() {
		return currentBalanceCoins.getCoinsAsList();
	}
	
	public List<Coin> getReturnedCoins() {
		return returnedCoins.getCoinsAsList();
	}
	
	public int getNumberOfCurrentBalanceCoins() {
		return currentBalanceCoins.getNumberOfCoins();
	}
	
	public int getNumberOfReturnedCoins() {
		return returnedCoins.getNumberOfCoins();
	}

}
