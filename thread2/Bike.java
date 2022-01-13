package thread2;

public class Bike implements Runnable {
	
	public void ride() {
		String tName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 騎了 %d 公里\n", tName, i);
		}
	}

	@Override
	public void run() {
		ride();
	}
}
