package com.briancerney;

public class BalanceCalculator {
	
	public BalanceCalculator() {
		
	}
	
	public ChangeAmount calculateBalance(CoinCollector currentCoins) {
		ChangeAmount runningTotal = ChangeAmount.ZERO_CENTS;
		
		for (Coin coin : currentCoins.getCurrentCoins()) {
			runningTotal = runningTotal.plus(ChangeAmount.returnChangeAmountOfCoinValue(coin));
		}
		return runningTotal;
	}
	
}
