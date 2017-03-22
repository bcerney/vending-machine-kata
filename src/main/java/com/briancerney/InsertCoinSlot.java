package com.briancerney;

import java.util.List;

public class InsertCoinSlot {
	private CoinCollector currentBalance;
//	private CoinCollector availableChange;
	private CoinReturn coinReturn;
	
	public InsertCoinSlot() {
		this.currentBalance = new CoinCollector();
		//this.availableChange = new CoinCollector();
		this.coinReturn = new CoinReturn();
	}

	public CoinCollector getCurrentBalance() {
		return currentBalance;
	}
	
//	public CoinCollector getAvailableChange() {
//		return availableChange;
//	}

	public CoinReturn getCoinReturn() {
		return coinReturn;
	}

	public List<Coin> getCurrentBalanceCoins() {
		return currentBalance.getCoinsAsList();
	}
	
//	public List<Coin> getAvailableChangeCoins() {
//		return availableChange.getCoinsAsList();
//	}
	
	public List<Coin> getReturnedCoins() {
		return coinReturn.getCoinsAsList();
	}
	
	public int getNumberOfCurrentBalanceCoins() {
		return currentBalance.getNumberOfCoins();
	}
	
	public int getNumberOfAvailableChangeCoins() {
		return currentBalance.getNumberOfCoins();
	}
	
	public int getNumberOfReturnedCoins() {
		return coinReturn.getNumberOfCoins();
	}
	
	private boolean isValidCoin(Coin coin) {
		return coin.equals(Coin.QUARTER) ||
				coin.equals(Coin.DIME) ||
				coin.equals(Coin.NICKEL);
	}
	
	public void insertCoin(Coin coinToAdd) {
		if (isValidCoin(coinToAdd)) {
			currentBalance.addCoin(coinToAdd);
		} else {
			coinReturn.addCoin(coinToAdd);
		}
	}
	
	public void returnCoins() {
		List<Coin> balance = currentBalance.getCoinsAsList();
		for (int i = 0; i < balance.size(); i++) {
			coinReturn.addCoin(balance.get(i));
		}
		currentBalance.clearCoinCollector();
	}
	

}
