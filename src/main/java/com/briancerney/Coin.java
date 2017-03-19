package com.briancerney;

public class Coin {
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
