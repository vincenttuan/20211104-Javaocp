package error_handle;

import java.util.Arrays;
import java.util.Scanner;

public class InputNumberTest3 {
	public static void main(String[] args) {
		int[] y = {1, 10, 0, 5}; // 分母陣列
		System.out.printf("請選擇分母 %s 輸入 index = ", Arrays.toString(y));
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		// 計算
		int x = 100; // 分子
		int de = y[idx]; // 分母
		
		try {
			int result = x / de;
			System.out.printf("%d / %d = %d\n", x, de, result);
		} catch (ArithmeticException e) {
			System.err.printf("有數學錯誤發生, 錯誤原因: %s\n", e.getMessage());
		}
		
		
	}
}
