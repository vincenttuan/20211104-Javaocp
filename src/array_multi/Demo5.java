package array_multi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// �q����Ԫ�
public class Demo5 {
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
			// �P�w User �O�_�ӧQ ?
			char user = 'O';
			boolean a1 = ttt[0][0] == user && ttt[0][1] == user && ttt[0][2] == user;
			boolean a2 = ttt[1][0] == user && ttt[1][1] == user && ttt[1][2] == user;
			boolean a3 = ttt[2][0] == user && ttt[2][1] == user && ttt[2][2] == user;
			boolean a4 = ttt[0][0] == user && ttt[1][0] == user && ttt[2][0] == user;
			boolean a5 = ttt[0][1] == user && ttt[1][1] == user && ttt[2][1] == user;
			boolean a6 = ttt[0][2] == user && ttt[1][2] == user && ttt[2][2] == user;
			boolean a7 = ttt[0][0] == user && ttt[1][1] == user && ttt[2][2] == user;
			boolean a8 = ttt[0][2] == user && ttt[1][1] == user && ttt[2][0] == user;
			
			boolean userWin = a1 || a2 || a3 || a4 || a5 || a6 || a7 || a8;
			if(userWin) {
				System.out.println("User Win !");
				// �L�X���
				for(char[] t : ttt) {
					System.out.println(Arrays.toString(t));
				}
				break;
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
			// �P�w PC �O�_�ӧQ ?
			char pc = 'X';
			a1 = ttt[0][0] == pc && ttt[0][1] == pc && ttt[0][2] == pc;
			a2 = ttt[1][0] == pc && ttt[1][1] == pc && ttt[1][2] == pc;
			a3 = ttt[2][0] == pc && ttt[2][1] == pc && ttt[2][2] == pc;
			a4 = ttt[0][0] == pc && ttt[1][0] == pc && ttt[2][0] == pc;
			a5 = ttt[0][1] == pc && ttt[1][1] == pc && ttt[2][1] == pc;
			a6 = ttt[0][2] == pc && ttt[1][2] == pc && ttt[2][2] == pc;
			a7 = ttt[0][0] == pc && ttt[1][1] == pc && ttt[2][2] == pc;
			a8 = ttt[0][2] == pc && ttt[1][1] == pc && ttt[2][0] == pc;
			
			boolean pcWin = a1 || a2 || a3 || a4 || a5 || a6 || a7 || a8;
			if(pcWin) {
				System.out.println("PC Win !");
				// �L�X���
				for(char[] t : ttt) {
					System.out.println(Arrays.toString(t));
				}
				break;
			}
			
		}
		
	}
}
