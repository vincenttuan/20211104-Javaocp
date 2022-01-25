package thread5;

public class Master implements Runnable {
	private Cookie cookie;
	
	public Master(Cookie cookie) {
		this.cookie = cookie;
	}
	
	@Override
	public void run() {
		// 放 10 塊餅乾
		for(int i=1;i<=10;i++) {
			cookie.put(i);
		}
	}
}
