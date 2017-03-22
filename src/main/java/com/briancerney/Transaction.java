package com.briancerney;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
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
	
	public boolean attemptPurchase(ChangeAmount productPrice, InsertCoinSlot coinSlot) {
		int priceInCents = productPrice.getTotalAmountInCents();
		
		coinSlot.getCurrentBalance().sortCoinsByHighestValue();
		List<Coin> balanceCoinsSorted = coinSlot.getCurrentBalanceCoins();
		
		if (canMakeChange(priceInCents, balanceCoinsSorted)) {
			makeChange(priceInCents, balanceCoinsSorted, coinSlot);
			return true;
		}
		
		return false;
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
	
	void makeChange(int priceInCents, List<Coin> sortedCoins, InsertCoinSlot coinSlot) {
		for (Iterator<Coin> iterator = sortedCoins.iterator(); iterator.hasNext();) {
			Coin nextCoin = iterator.next();
			int nextCoinCents = nextCoin.getCoinChangeAmount().getTotalAmountInCents();
			if (priceInCents - nextCoinCents >= 0) {
				priceInCents -= nextCoinCents;
				iterator.remove();
				if (priceInCents == 0) {
					coinSlot.returnCoins();
				}
			}
		}
	}
	
}
