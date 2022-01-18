package thread3;

public class Father extends Thread {

	@Override
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸準備洗澡");
		System.out.println("爸爸發現沒瓦斯");
		System.out.println("爸爸請工人送瓦斯");
		
		Worker worker = new Worker(); // 建立工人執行緒
		System.out.println("爸爸等待工人送瓦斯...");
		worker.start(); // 工人執行送瓦斯的行為
		
		try {
			worker.join(5000);
		} catch (InterruptedException e) {
			System.out.println("意外發生:" + e);
			return;
		}
		
		System.out.println("工人將瓦斯裝好");
		System.out.println("爸爸開始洗澡");
		System.out.println("爸爸洗完澡了");
		
	}
	
}
