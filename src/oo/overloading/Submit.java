package oo.overloading;

// ���b/�ǰe
public class Submit {
	public void checkOut(int money) {
		System.out.println("1. ���b:" + money);
	}
	
	void checkOut(String cardNo, int money) {
		System.out.println("2. ���b:" + money + ", �d��:" + cardNo);
	}
	
	protected void checkOut() {
		System.out.println("3. ���b, ��ĵ");
	}
}
