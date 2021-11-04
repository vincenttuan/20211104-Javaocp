package array;

import java.util.Arrays;
import java.util.Random;

public class HelloArray4 {

	public static void main(String[] args) {
		int[] poker = new int[13];
		System.out.println(Arrays.toString(poker));
		for(int i=0;i<poker.length;i++) {
			poker[i] = (i+1);
		}
		System.out.println(Arrays.toString(poker));
		// ¬~µP shuffle
		Random r = new Random();
		int count = 8;
		for(int i=1;i<=count;i++) {
			int index1 = r.nextInt(poker.length); // 0~12
			int index2 = r.nextInt(poker.length); // 0~12
			int a1 = poker[index1];
			int a2 = poker[index2];
			poker[index1] = a2;
			poker[index2] = a1;
		}
		
		System.out.println(Arrays.toString(poker));
		
		
	}

}
