package com.briancerney;

public class ChangeAmount {
	public static final ChangeAmount ZERO_CENTS = new ChangeAmount(0);
		
	private int totalAmountInCents;

	public ChangeAmount(int totalAmountInCents) {
		this.totalAmountInCents = totalAmountInCents;
	}

	public int getTotalAmountInCents() {
		return totalAmountInCents;
	}

	public void setTotalAmountInCents(int totalAmountInCents) {
		this.totalAmountInCents = totalAmountInCents;
	}
	
	
	
	
	

}
