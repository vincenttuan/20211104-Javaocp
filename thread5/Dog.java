package thread5;

public class Dog implements Runnable {
	private Cookie cookie;
	
	public Dog(Cookie cookie) {
		this.cookie = cookie;
	}
	
	@Override
	public void run() {
		// 吃 10 塊餅乾
		for(int i=1;i<=10;i++) {
			cookie.eat(i);
		}
	}
}
