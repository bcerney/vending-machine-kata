package com.briancerney;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
	
	boolean canMakeChange(int priceInCents, List<Coin> sortedCoins) {
		for (int i = 0; i < sortedCoins.size(); i++) {
			int nextCoinCents = sortedCoins.get(i).getCoinChangeAmount().getTotalAmountInCents();
			if (priceInCents - nextCoinCents >= 0) {
				priceInCents -= nextCoinCents;
				if (priceInCents == 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean attemptPurchase(ChangeAmount productPrice, InsertCoinSlot coinSlot) {
		int priceInCents = productPrice.getTotalAmountInCents();
		coinSlot.getCurrentBalance().sortCoinsByHighestValue();
		List<Coin> balanceCoinsSorted = coinSlot.getCurrentBalanceCoins();
		
		if (canMakeChange(priceInCents, balanceCoinsSorted)) {
			
		}
		
		return false;
	}
	
	
	
}
