package error_handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberTest5 {

	public static void main(String[] args) {
		int num = 10; // 分子
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分母:");
		
		try {
			int de = sc.nextInt();
			int result = num / de;
			if(de == 0) {
				System.out.println("分母不可=0");
			} else {
				System.out.println(result);
			}
		} catch (InputMismatchException e) {
			System.out.println("輸入錯誤");
		}
		

	}

}
