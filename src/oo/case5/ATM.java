package oo.case5;

import java.util.Scanner;

public class ATM {
	Account acct; // �b��(���d)
	Account acctT; // ��b��H
	
	ATM(Account acct) {
		this.acct = acct;
	}
	
	ATM(Account acct, Account acctT) {
		this.acct = acct;
		this.acctT = acctT;
	}
	
	void menu() {
		System.out.println("------------");
		System.out.println("1. �d�߱b��");
		System.out.println("2. �s��");
		System.out.println("3. ����");
		if(acctT != null) {
			System.out.println("4. ��b");
		}
		System.out.println("0. Exit");
		System.out.println("------------");
		System.out.print("�п��: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		switch (n) {
			case 1:
				System.out.println(acct);
				break;
			case 2:
				System.out.print("�п�J�s�ڪ��B: ");
				int amount = scanner.nextInt();
				boolean saveCheck = acct.save(amount);
				if(saveCheck) {
					System.out.println("���ڦ��\");
				} else {
					System.out.println("���ڥ���");
				}
				break;
			case 3:
				System.out.print("�п�J���ڪ��B: ");
				int amount2 = scanner.nextInt();
				boolean withdrawCheck = acct.withdraw(amount2);
				if(withdrawCheck) {
					System.out.println("���ڦ��\");
				} else {
					System.out.println("���ڥ���");
				}
				break;
			case 4:
				System.out.print("�п�J��b���B: ");
				int amount3 = scanner.nextInt();
				boolean transferCheck = acct.transfer(amount3, acctT);
				if(transferCheck) {
					System.out.println("��b���\");
					System.out.printf("%s �൹ %s $%d\n", acct.name, acctT.name, amount3);
				} else {
					System.out.println("��b����");
				}
				break;
			case 0:
				System.exit(1);
		}
	}
	
	void start() {
		while (true) {
			menu();
		}
	}
	
	
}
