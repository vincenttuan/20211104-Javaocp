package array_multi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// �q����Ԫ�
public class Demo4 {
	public static void main(String[] args) {
		Random r = new Random();
		char[][] ttt = {
				{' ', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', ' '},
		};
		for(int i=0; ;i++) {
			// �L�X���
			for(char[] t : ttt) {
				System.out.println(Arrays.toString(t));
			}
			// User ��
			Scanner sc = new Scanner(System.in);
			System.out.print("�п�J 0~8: ");
			int n = sc.nextInt();
			// �ˬd��ƬO�_�O�ť� ?
			if(ttt[n/3][n%3] == ' ') {
				ttt[n/3][n%3] = 'O';
			} else {
				System.out.println("���B�w�����");
				continue;
			}
			//------------------------------------------------
			// PC ��
			while(true) {
				n = r.nextInt(9); // 0~8
				if(ttt[n/3][n%3] == ' ') {
					ttt[n/3][n%3] = 'X';
					break; // ���� while �j��
				}
			}
			
			
		}
		
	}
}
