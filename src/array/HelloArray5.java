package array;

import java.util.Arrays;
import java.util.Random;

public class HelloArray5 {
	public static void main(String[] args) {
		int[] poker = new int[13];
		System.out.println(Arrays.toString(poker));
		for (int i = 0; i < poker.length; i++) {
			poker[i] = (i + 1);
		}
		System.out.println(Arrays.toString(poker));
		// 洗牌 shuffle
		Random r = new Random();
		int a1 = poker[0]; // a1 = 1 , 將 poker[0] 的內容給 a1
		int a2 = poker[3]; // a2 = 4 , 將 poker[3] 的內容給 a2
		poker[0] = a2; // poker[0] = 4 , 將 a2 的值放到 poker[0] 裡面
		poker[3] = a1; // poker[3] = 1 , 將 a1 的值放到 poker[3] 裡面
		
		System.out.println(Arrays.toString(poker));

	}
}
