package lab;

public class Lab2 {

	public static void main(String[] args) {
		String str = "Happy New Year And Merry Christmas";
		System.out.println(str);
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		System.out.println(str);
		int end = str.indexOf(" ");
		System.out.println(end);
		
	}

}
