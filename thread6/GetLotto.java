package thread6;

import java.util.Random;

public class GetLotto implements Runnable {
	private Random r = new Random();
	@Override
	public void run() {
		System.out.println(r.nextInt(100));
	}
	
}
