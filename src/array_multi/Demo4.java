package array_multi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 電腦對戰版
public class Demo4 {
	public static void main(String[] args) {
		Random r = new Random();
		char[][] ttt = {
				{' ', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', ' '},
		};
		for(int i=0; ;i++) {
			// 印出資料
			for(char[] t : ttt) {
				System.out.println(Arrays.toString(t));
			}
			// User 玩
			Scanner sc = new Scanner(System.in);
			System.out.print("請輸入 0~8: ");
			int n = sc.nextInt();
			// 檢查資料是否是空白 ?
			if(ttt[n/3][n%3] == ' ') {
				ttt[n/3][n%3] = 'O';
			} else {
				System.out.println("此處已有資料");
				continue;
			}
			//------------------------------------------------
			// PC 玩
			while(true) {
				n = r.nextInt(9); // 0~8
				if(ttt[n/3][n%3] == ' ') {
					ttt[n/3][n%3] = 'X';
					break; // 跳離 while 迴圈
				}
			}
			
			
		}
		
	}
}
