package oo.overloading;

public class Main {

	public static void main(String[] args) {
		Submit submit = new Submit();
		submit.checkOut(100);
		submit.checkOut("1111-2222-3333-4444", 100);
		submit.checkOut();
	}

}
