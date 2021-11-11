package array_multi;

import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		char[][] ttt = {
				{'O', 'X', 'O'},
				{'X', 'O', 'O'},
				{' ', 'X', 'X'},
		};
		for(char[] t : ttt) {
			System.out.println(Arrays.toString(t));
		}
		ttt[2][0] = 'O';
		for(char[] t : ttt) {
			System.out.println(Arrays.toString(t));
		}
	}
}
