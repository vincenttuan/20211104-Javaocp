package thread3;

public class Worker extends Thread {
	
	@Override
	public void run() {
		System.out.println("工人接到通知");
		System.out.println("工人開始送瓦斯");
		// 模擬工人運送瓦斯的時間
		for(int i=1;i<=2;i++) {
			System.out.printf("%d 秒鐘 ", i);
			try {
				Thread.sleep(1000); // 模擬等待
			} catch (InterruptedException e) { // 中斷例外
				System.out.println("工人發生意外: " + e);
			}
		}
		System.out.println("工人將瓦斯送到家");
	}
	
}
