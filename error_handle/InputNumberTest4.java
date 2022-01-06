package error_handle;

import java.util.Scanner;

public class InputNumberTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 10; // 分子
		System.out.print("請輸入分母:");
		int de = sc.nextInt();
		calc1(num, de);
		
		try {
			calc2(num, de);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// 計算結果 1
	public static void calc1(int num, int de) {
		try {
			int result = num / de;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("數學錯誤:" + e);
		}
	}
	
	// 計算結果 2
	public static void calc2(int num, int de) throws Exception {
		if(de == 0) { // 分母若 == 0
			Exception e = new Exception("分母不可=0"); // 自行建立一個例外物件
			throw e;
		}
		int result = num / de;
		System.out.println(result);
	}
	
}
