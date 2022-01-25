package thread7;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorDemo {
	public static void main(String[] args) {
		// 建立執行緒池
		//ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		for(int i=1;i<=100;i++) {
			exec.submit(new GetLotto());
		}
		System.out.printf("使用執行緒數量: %d\n", Thread.activeCount());
		exec.shutdown();
	}
}
