package oo.case5;

public class Main {
	public static void main(String[] args) {
		Account john = new Account("��v");
		ATM atm = new ATM(john);
		atm.start();
	}
}
