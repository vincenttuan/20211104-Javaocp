package thread7;

import java.util.Random;

public class GetLotto implements Runnable {
	private Random r = new Random();

	@Override
	public void run() {
		// 模擬搖獎的時間
		try {
			Thread.sleep(r.nextInt(1));
		} catch (Exception e) {
			System.out.println(e);
		}
		// 印出獎號
		System.out.println(r.nextInt(100));
	}
	
	
}
