package com.briancerney;

public class Transaction {
	
	public Transaction() {
		
	}
	
	public ChangeAmount calculateChangeAmount(CoinCollector currentCoins) {
		ChangeAmount runningTotal = ChangeAmount.ZERO_CENTS;
		
		for (Coin coin : currentCoins.getCoinsAsList()) {
			runningTotal = runningTotal.plus(ChangeAmount.returnChangeAmountOfCoinValue(coin));
		}
		return runningTotal;
	}
	
	
	
}
