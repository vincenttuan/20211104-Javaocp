package oo.case9;

public class ClotheStore {
	public static void main(String[] args) {
		System.out.println(Clothe.brandName);
		Clothe c1 = new Clothe();
		System.out.println(c1);
		Clothe c2 = new Clothe();
		c2.setAmount(10);
		c2.setSize(Size.L); // c2.setSize(500);
		System.out.println(c2);
		Clothe c3 = new Clothe();
		c3.setAmount(5);
		System.out.println(c3);
		Clothe c4 = new Clothe();
		c4.setSize(Size.S);
		System.out.println(c4);
	}
}
