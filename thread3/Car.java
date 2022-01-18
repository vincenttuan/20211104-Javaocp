package thread3;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
	private CyclicBarrier cyclicBarrier;
	
	public Car(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}
	
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 從桃園出發\n", tName);
		
		// 模擬程式正在忙碌的效果(執行的時間)
		try {
			Thread.sleep(new Random().nextInt(10000));
			System.out.printf("%s 到台中了\n", tName);
			cyclicBarrier.await(); // 等待其他執行緒
		} catch (Exception e) {
			System.out.printf("%s 發生意外: %s\n", tName, e);
			return; // 方法提前結束
		}
		
		System.out.printf("%s 繼續往高雄出發...\n", tName);
		
	}
	
}
