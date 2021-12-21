package oo.enums;

public enum USCurrency {
	// PENNY:1, NICKEL:5, DIME:10, QUARTER:25
	PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
	
	private int value;
	
	// 建構子 private
	private USCurrency(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
