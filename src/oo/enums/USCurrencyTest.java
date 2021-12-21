package oo.enums;

public class USCurrencyTest {
	public static void main(String[] args) {
		// PENNY:1, NICKEL:5, DIME:10, QUARTER:25
		                   // ¤£¨Ï¥Î new
		USCurrency usCoin = USCurrency.NICKEL;
		System.out.println(usCoin.getValue());
	}
}
