package thread5;

public class Cookie {
	
	private boolean empty = true; // 盤子的狀態
	
	public synchronized void eat(int n) { // 吃餅乾
		if(empty) {
			try {
				wait(); // 小狗進入等待(wait())狀態, 等著被喚醒(notify() / notifyAll())
			} catch (Exception e) {
				
			}
		}
		System.out.printf("小狗吃了第 %d 塊餅乾\n", n);
		// 吃完之後
		empty = true; // 盤子清空
		notify(); // 通知主人放餅乾
	}
	
	public synchronized void put(int n) { // 放餅乾
		if(!empty) {
			try {
				wait(); // 主人進入等待(wait())狀態, 等著被喚醒(notify() / notifyAll())
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		// 盤子若空了
		System.out.printf("主人放了第 %d 塊餅乾\n", n);
		empty = false; // 盤子有餅乾(不是空盤)
		notify(); // 通知小狗吃餅乾
	}
}
