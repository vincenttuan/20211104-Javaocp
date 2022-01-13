package thread2;

public class Main {
	public static void main(String[] args) {
		// 建立任務
		Walk walk = new Walk();
		Bike bike = new Bike();
		Music music = new Music();
		Thread t1 = new Thread(walk, "小明");
		Thread t2 = new Thread(bike, "小英");
		Thread t3 = new Thread(music, "音樂");
		t3.setDaemon(true); // 設定為背景執行緒
		
		t1.start();
		t2.start();
		t3.start();
	}
}
