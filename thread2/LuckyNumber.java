package thread2;

public class LuckyNumber implements Runnable {
	// 顏色
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	private int targetNumber = 777;
	public LuckyNumber() {
		
	}
	public LuckyNumber(int targetNumber) {
		this.targetNumber = targetNumber;
	}
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		for(int i=1;;i++) {
			int x = (int)(Math.random() * 1000);
			System.out.printf("%s 在第 %d 次取到了 %d\n", tName, i, x);
			if(x == targetNumber) {
				System.out.printf("%s 總共取了 %d 次才得到 %d\n", tName, i, targetNumber);
				break;
			}
		}
		
	}
	
}
