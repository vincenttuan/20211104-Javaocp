package oo.case4;

public class Account {
	String name; // ��W
	int balance; // �b��l�B
	Account(String n) {
		name = n;
	}
	void withdraw(int amount) { // ����
		balance = balance - amount;
	}
	void save(int amount) { // �s��
		balance = balance + amount;
	}
	void transfer(int amount, Account toAccount) { // ��b
		withdraw(amount); // �ڴ���
		toAccount.save(amount); // ���s��
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}
	
}
