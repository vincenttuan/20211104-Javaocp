package lab;

import java.util.Arrays;

public class Lab1 {

	public static void main(String[] args) {
		String s = "Happy New Year And Merry Christmas";
		String[] array = s.split(" "); //  �Q�ΪŮ���Φr��
		System.out.println(Arrays.toString(array));
		int len = array.length;
		
		String lastword = array[len - 1]; // �̫�@�Ӧr
		System.out.println(lastword);
		System.out.println(lastword.length());
		
	}

}
