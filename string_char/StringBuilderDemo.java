package string_char;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Java").append("8");
		System.out.println(sb);
		
		String s = "";
		s = s.concat("Java").concat("8");
		System.out.println(s);
		
		// sb �P s ���e�ۤ� ?
		System.out.println( s.equals(sb) );
		System.out.println( s.equals(sb.toString()) ); // �N sb ��r�ꤧ��A��
	}

}
