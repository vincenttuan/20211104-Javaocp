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
		// �~�P shuffle
		Random r = new Random();
		int a1 = poker[0]; // a1 = 1 , �N poker[0] �����e�� a1
		int a2 = poker[3]; // a2 = 4 , �N poker[3] �����e�� a2
		poker[0] = a2; // poker[0] = 4 , �N a2 ���ȩ�� poker[0] �̭�
		poker[3] = a1; // poker[3] = 1 , �N a1 ���ȩ�� poker[3] �̭�
		
		System.out.println(Arrays.toString(poker));

	}
}
