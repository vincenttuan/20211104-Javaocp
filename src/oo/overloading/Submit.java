package oo.overloading;

// 結帳/傳送
public class Submit {
	public void checkOut(int money) {
		System.out.println("1. 結帳:" + money);
	}
	
	void checkOut(String cardNo, int money) {
		System.out.println("2. 結帳:" + money + ", 卡號:" + cardNo);
	}
	
	protected void checkOut() {
		System.out.println("3. 賒帳, 報警");
	}
}
