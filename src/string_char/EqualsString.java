package string_char;

public class EqualsString {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		// ��� stack �����e, �ӫD����r�ꪺ���e
		System.out.println(s1 == s2);
		// ����r�ꪺ���e
		System.out.println(s1.equals(s2));
		
		String s3 = new String("jAvA");
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3)); // �����j�p�g���
		
		System.out.println("-------------");
		
		String s4 = "Java";
		String s5 = "Java";
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));
		System.out.println(s1.equals(s5));
	}

}
