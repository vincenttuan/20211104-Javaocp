package thread6;

import java.util.concurrent.Executor;

public class MyExecutor implements Executor {

	@Override
	public void execute(Runnable r) {
		Thread t = new Thread(r);
		t.start();
	}
	
}
