package oo.case5;

public class Main {
	public static void main(String[] args) {
		Account john = new Account("��v");
		Account mary = new Account("Mary");
		ATM atm = new ATM(john, mary);
		atm.start();
	}
}
