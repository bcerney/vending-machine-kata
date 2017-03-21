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
		List<Coin> currentBalance = coinSlot.getCurrentBalance().getCoinsAsList();
		// left off here, hoping to sort by ChangeAmount, iterate through, check if exact change can be made
		
		
		
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
