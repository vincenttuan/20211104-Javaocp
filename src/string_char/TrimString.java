package string_char;

public class TrimString {

	public static void main(String[] args) {
		String s = "  abc  ";
		System.out.println(s);
		System.out.println(s.length());
		s = s.trim(); // �h�����k�G��ť�
		System.out.println(s);
		System.out.println(s.length());
	}

}

