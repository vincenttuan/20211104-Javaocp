package array_multi;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		char[][] ttt = {
				{' ', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', ' '},
		};
		for(int i=0; ;i++) {
			for(char[] t : ttt) {
				System.out.println(Arrays.toString(t));
			}
			Scanner sc = new Scanner(System.in);
			System.out.print("請輸入 0~8: ");
			int n = sc.nextInt();
			// 檢查資料是否是空白 ?
			if(ttt[n/3][n%3] == ' ') {
				ttt[n/3][n%3] = (i % 2 == 0) ? 'O' : 'X';
			} else {
				System.out.println("此處已有資料");
			}
		}
		
	}
}
