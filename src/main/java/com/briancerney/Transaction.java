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
	
	private void transferPurchaseCoinsToAvailableChange(ChangeAmount productPrice, InsertCoinSlot coinSlot) {
		int currentTotalCents = productPrice.getTotalAmountInCents();
		List<Coin> currentBalance = coinSlot.getCurrentBalance();
		
		Collections.sort(currentBalance, new Comparator<ChangeAmount>() {
		    public int compare(ChangeAmount coin1, ChangeAmount coin2) {
		        return ChangeAmount.returnChangeAmountOfCoinValue(coin1).compareTo(ChangeAmount.returnChangeAmountOfCoinValue(coin2));
		    }
		});
		
		
		while (currentTotalCents > 0) {
			if (currentTotalCents > 25) {

				
			}
			
		}
	}
	
	public boolean attemptPurchase(ChangeAmount productPrice, InsertCoinSlot coinSlot) {
		transferPurchaseCoinsToAvailableChange(productPrice, coinSlot);
		coinSlot.getCurrentBalance().clearCoinCollector();
		
		return false;
	}
	
	
	
}
