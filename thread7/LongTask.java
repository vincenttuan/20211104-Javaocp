package thread7;

import java.util.Random;
import java.util.concurrent.TimeUnit;

// 長任務
public class LongTask implements Runnable {
	private Random r = new Random();
	@Override
	public void run() {
		System.out.println("長任務-開始");
		try {
			TimeUnit.SECONDS.sleep(r.nextInt(5) + 1);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("長任務-結束");
	}
	
}
