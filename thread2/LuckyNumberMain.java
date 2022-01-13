package thread2;

public class LuckyNumberMain {

	public static void main(String[] args) {
		LuckyNumber n1 = new LuckyNumber();
		LuckyNumber n2 = new LuckyNumber(123);
		
		Thread t1 = new Thread(n1, "小明\t\t\t");
		Thread t2 = new Thread(n1, "Mary");
		
		t1.start();
		t2.start();
	}

}
