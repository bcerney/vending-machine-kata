package com.briancerney;

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
		
		Collections.sort(currentBalance, new Comparator<Coin>() {
		    public int compare(Coin coin1, Coin coin2) {
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
