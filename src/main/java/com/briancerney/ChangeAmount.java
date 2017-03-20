package com.briancerney;

public class ChangeAmount {
	public static final ChangeAmount ZERO_CENTS = new ChangeAmount(0);
	public static final ChangeAmount QUARTER = new ChangeAmount(25);
	public static final ChangeAmount DIME = new ChangeAmount(10);
	public static final ChangeAmount NICKEL = new ChangeAmount(5);
	public static final ChangeAmount PENNY = new ChangeAmount(1);

		
	private int totalAmountInCents;

	public ChangeAmount(int totalAmountInCents) {
		this.totalAmountInCents = totalAmountInCents;
	}

	public int getTotalAmountInCents() {
		return totalAmountInCents;
	}
	
	public int getDollars() {
		return totalAmountInCents / 100;
	}
	
	public int getCents() {
		return (int) (totalAmountInCents % 100);
	}

	public void setTotalAmountInCents(int totalAmountInCents) {
		this.totalAmountInCents = totalAmountInCents;
	}
	
	public ChangeAmount plus(ChangeAmount amountToAdd) {
		return new ChangeAmount(this.getTotalAmountInCents() + amountToAdd.getTotalAmountInCents());
	}
	
	public static ChangeAmount returnChangeAmountOfCoinValue(Coin coin) {
		if (coin.equals(Coin.QUARTER)) {
			return ChangeAmount.QUARTER;
		} else if (coin.equals(Coin.DIME)) {
			return ChangeAmount.DIME;
		} else if (coin.equals(Coin.NICKEL)) {
			return ChangeAmount.NICKEL;
		} 
		return ChangeAmount.ZERO_CENTS;
	}
	
	@Override
	public String toString() {
		return "$"+getDollars()+"."+String.format("%02d", getCents());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof ChangeAmount) {
			return this.totalAmountInCents == ((ChangeAmount) obj).totalAmountInCents;
		} else {
			return false;
		}
	}
	

}
