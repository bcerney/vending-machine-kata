package com.briancerney;

import java.util.List;

public class InsertCoinSlot {
	private CoinCollector coinCollector;
	private CoinReturn coinReturn;
	
	public InsertCoinSlot() {
		this.coinCollector = new CoinCollector();
		this.coinReturn = new CoinReturn();
	}

	public CoinCollector getCoinCollector() {
		return coinCollector;
	}

	public CoinReturn getCoinReturn() {
		return coinReturn;
	}

	public List<Coin> getCurrentBalanceCoins() {
		return coinCollector.getCoinsAsList();
	}
	
	public List<Coin> getReturnedCoins() {
		return coinReturn.getCoinsAsList();
	}
	
	public int getNumberOfCurrentBalanceCoins() {
		return coinCollector.getNumberOfCoins();
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
			coinCollector.addCoin(coinToAdd);
		} else {
			coinReturn.addCoin(coinToAdd);
		}
	}
	
	

}
