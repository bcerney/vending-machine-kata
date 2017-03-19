package com.briancerney;

public class Coin {
	public static final Coin QUARTER = new Coin(6,24);
	public static final Coin DIME = new Coin(2,18);
	public static final Coin NICKEL = new Coin(5,21);
	public static final Coin PENNY = new Coin(3,19);
	
	private int weightInGrams;
	private int diameterInMm;
	
	public Coin() {
		
	}
	
	public Coin(int weightInGrams, int diameterInMm) {
		this.weightInGrams = weightInGrams;
		this.diameterInMm = diameterInMm;
	}

	public int getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

	public int getDiameterInMm() {
		return diameterInMm;
	}

	public void setDiameterInMm(int diameterInMm) {
		this.diameterInMm = diameterInMm;
	}
	
	
	
}
