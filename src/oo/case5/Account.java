package oo.case5;

public class Account {
	String name; // ��W
	int balance; // �b��l�B
	Account(String n) {
		name = n;
	}
	
	boolean withdraw(int amount) { // ����
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
			return true;
		}
		return false;
	}
	
	boolean save(int amount) { // �s��
		if(amount > 0) {
			balance = balance + amount;
			return true;
		}
		return false;
	}
	
	boolean transfer(int amount, Account toAccount) { // ��b
		boolean check = withdraw(amount); // �ڴ���
		if(check == true) {
			toAccount.save(amount); // ���s��
		}
		return check;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}
	
}
