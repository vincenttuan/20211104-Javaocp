package error_handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入半徑: ");
		int r = 0;
		
		try {
			r = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("輸入不正確");
			System.err.println(e);
		}
		
		double area = Math.pow(r, 2) * Math.PI;
		
		System.out.printf("半徑: %d 圓面積: %.1f\n", r, area);
	}

}
