package thread2;

public class Main {
	public static void main(String[] args) {
		// 建立任務
		Walk walk = new Walk();
		Bike bike = new Bike();
		
		Thread t1 = new Thread(walk, "小明");
		Thread t2 = new Thread(bike, "小英");
		
		t1.start();
		t2.start();
		
	}
}
