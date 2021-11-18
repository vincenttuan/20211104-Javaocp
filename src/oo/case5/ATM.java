package oo.case5;

import java.util.Scanner;

public class ATM {
	Account acct; // 帳戶(插卡)
	
	ATM(Account acct) {
		this.acct = acct;
	}
	
	void menu() {
		System.out.println("------------");
		System.out.println("1. 查詢帳戶");
		System.out.println("2. 存款");
		System.out.println("3. 提款");
		System.out.println("0. Exit");
		System.out.println("------------");
		System.out.print("請選擇: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		switch (n) {
			case 1:
				System.out.println(acct);
				break;
			case 2:
				System.out.print("請輸入存款金額: ");
				scanner = new Scanner(System.in);
				int amount = scanner.nextInt();
				boolean saveCheck = acct.save(amount);
				if(saveCheck) {
					System.out.println("提款成功");
				} else {
					System.out.println("提款失敗");
				}
				break;
			case 3:
				System.out.print("請輸入提款金額: ");
				scanner = new Scanner(System.in);
				int amount2 = scanner.nextInt();
				boolean withdrawCheck = acct.withdraw(amount2);
				if(withdrawCheck) {
					System.out.println("提款成功");
				} else {
					System.out.println("提款失敗");
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
