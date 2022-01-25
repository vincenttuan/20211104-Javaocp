package thread6;

import java.util.Date;

public class GetTime implements Runnable {
	@Override
	public void run() {
		System.out.println(new Date());
	}
	
}
