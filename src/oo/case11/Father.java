package oo.case11;

public class Father {
	int cash = 0;
	public Father(int cash) {
		this.cash = cash;
		System.out.println("���� Father �غc�l cash=" + cash);
	}
	public void profit() {
		System.out.println(cash);
	}
}
