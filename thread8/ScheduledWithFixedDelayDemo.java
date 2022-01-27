package thread8;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Danger extends Thread {
	private int temp;
	Danger(int temp) {
		this.temp = temp;
	}
	public void run() {
		System.err.println(temp + "度, 溫度過高發簡訊通知 ....");
	}
}

public class ScheduledWithFixedDelayDemo {

	public static void main(String[] args) {
		Random random = new Random();
		Runnable r = () -> {
			System.out.printf("開始作業: %s\n", new Date());
			int delayTime = random.nextInt(8000);
			try {
				Thread.sleep(delayTime);
			} catch (Exception e) {
				
			}
			int temp = random.nextInt(10);
			System.out.printf("結束作業: %s, %d 度, delayTime:%d\n", new Date(), temp, delayTime);
			if(temp > 5) {
				new Danger(temp).start();
			}
		};
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		int initTime = 1; // 初始時間(預備時間)
		int fixedTime = 5; // 固定間格時間 
		//service.scheduleWithFixedDelay(r, initTime, fixedTime, TimeUnit.SECONDS);
		service.scheduleAtFixedRate(r, initTime, fixedTime, TimeUnit.SECONDS);
		
	}

}
