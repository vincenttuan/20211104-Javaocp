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
			System.out.print("�п�J 0~8: ");
			int n = sc.nextInt();
			// �ˬd��ƬO�_�O�ť� ?
			if(ttt[n/3][n%3] == ' ') {
				ttt[n/3][n%3] = (i % 2 == 0) ? 'O' : 'X';
			} else {
				System.out.println("���B�w�����");
			}
		}
		
	}
}
