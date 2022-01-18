package thread4;

public class Account {
	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amount) {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 進來提款\n", tName);
		// 取得目前最新餘額
		int current_balance = getBalance(); 
		// 模擬提款時間
		for(int i=0;i<999999999;i++);
		// 判斷是否可以提款
		if(current_balance >= amount) {
			setBalance(current_balance - amount);
			System.out.printf("%s 提款: %,d 成功 餘額: %,d\n", tName, amount, getBalance());
		} else {
			System.out.printf("%s 提款: %,d 失敗 餘額: %,d\n", tName, amount, getBalance());
		}
	}
	
}
