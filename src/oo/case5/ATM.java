package oo.case5;

import java.util.Scanner;

public class ATM {
	Account acct; // �b��(���d)
	
	ATM(Account acct) {
		this.acct = acct;
	}
	
	void menu() {
		System.out.println("------------");
		System.out.println("1. �d�߱b��");
		System.out.println("2. �s��");
		System.out.println("3. ����");
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
				scanner = new Scanner(System.in);
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
				scanner = new Scanner(System.in);
				int amount2 = scanner.nextInt();
				boolean withdrawCheck = acct.withdraw(amount2);
				if(withdrawCheck) {
					System.out.println("���ڦ��\");
				} else {
					System.out.println("���ڥ���");
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
