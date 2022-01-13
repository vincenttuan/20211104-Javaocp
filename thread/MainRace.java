package thread;

public class MainRace {
	public static void main(String[] args) {
		Race r1 = new Race();
		Race r2 = new Race();
		r1.setName("烏龜"); // 設定執行緒名稱
		r2.setName("兔子");
		// 執行緒權限 1~10 數字越大被調用到的機率越多次
		r1.setPriority(Thread.MAX_PRIORITY); // 10
		r2.setPriority(Thread.MIN_PRIORITY); // 1
		System.out.println(r1.getPriority());
		System.out.println(r2.getPriority());
		//r1.job();
		//r2.job();
		r1.start();
		r2.start();
	}
}
