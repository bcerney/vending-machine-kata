package com.briancerney;

import java.util.ArrayList;
import java.util.List;

public class CoinReturn implements CoinCollection {
	private List<Coin> returnedCoins;
	
	public CoinReturn() {
		this.returnedCoins = new ArrayList<Coin>();
	}
	
	public List<Coin> getCoinsAsList() {
		return returnedCoins;
	}
	
	public void addCoin(Coin coinToAdd) {
		returnedCoins.add(coinToAdd);
	}
	
	public int getNumberOfCoins() {
		return returnedCoins.size();
	}
	
	@Override
	public String toString() {
		if (returnedCoins.isEmpty()) {
			return "The coin return is empty!";
		}
		return "";
	}

}
