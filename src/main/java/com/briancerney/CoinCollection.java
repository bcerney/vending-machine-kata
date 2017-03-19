package com.briancerney;

import java.util.List;

public interface CoinCollection {
	
	List<Coin> getCoinsAsList();
	void addCoin(Coin coinToAdd);
	int getNumberOfCoins();

}
