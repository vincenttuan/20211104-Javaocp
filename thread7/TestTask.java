package thread7;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestTask {

	public static void main(String[] args) throws Exception {
		ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		exec.submit(new ShortTask());
		exec.submit(new LongTask());
		exec.submit(new LongTask());
		exec.submit(new ShortTask());
		exec.submit(new LongTask());
		exec.submit(new ShortTask());
		exec.submit(new ShortTask());
		
		// 關閉
		exec.shutdown();
		
		// 偵測執行緒池的狀態
		// 當 exec 是否還未關閉 (每秒檢查一次)
		while (!exec.awaitTermination(1, TimeUnit.SECONDS)) {
			System.out.println("執行緒池尚未關閉 ! 所以我要做 ..." + new Date());
		}
		
		System.out.println("執行緒池已關閉");
	}

}
