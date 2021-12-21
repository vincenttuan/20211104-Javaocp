package oo.enums;

public class SexTest {
	public static void main(String[] args) {
		printJob(Sex.女);
		printJob(Sex.男);
	}
	
	public static void printJob(Sex sex) {
		switch (sex) {
			case 男:
				System.out.println("男主外");
				break;
	
			case 女:
				System.out.println("女主內");
				break;
		}
	}
}
