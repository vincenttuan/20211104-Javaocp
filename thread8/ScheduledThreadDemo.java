package thread8;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadDemo {

	public static void main(String[] args) {
		
		Runnable r = () -> System.out.println(new Date());
		System.out.println("等 10 秒後跑出現在的時間");
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.schedule(r, 10, TimeUnit.SECONDS);
		
		service.shutdown();

	}

}
