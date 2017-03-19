package com.briancerney;

import java.util.ArrayList;
import java.util.List;

public class CoinReturn {
	private List<Coin> returnedCoins;
	
	public CoinReturn() {
		this.returnedCoins = new ArrayList<Coin>();
	}
	
	public List<Coin> getReturnedCoins() {
		return returnedCoins;
	}
	
	public void addCoin(Coin coinToAdd) {
		returnedCoins.add(coinToAdd);
	}
	
	public int getNumberOfCoins() {
		return returnedCoins.size();
	}

}
