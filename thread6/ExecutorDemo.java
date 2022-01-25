package thread6;

import java.util.concurrent.Executor;

public class ExecutorDemo {

	public static void main(String[] args) {
		// 工作
		Runnable r1 = new GetLotto();
		Runnable r2 = new GetTime();
		// 執行者
		Executor exec = new MyExecutor();
		exec.execute(r1);
		exec.execute(r1);
		exec.execute(r2);
		
	}

}
