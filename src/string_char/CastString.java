package string_char;

public class CastString {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "JAVA";
		System.out.println(s1 == s2);
		
		s1 = s1.toUpperCase().intern(); // .intern() �O�i�H��r���J�� String pool �� "�@��"
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
