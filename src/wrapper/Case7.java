package wrapper;

public class Case7 {

	public static void main(String[] args) {
		// int �P Integer ����������
		// Java 5 �H�e
		int x = 100;
		Integer y = Integer.valueOf(200);
		System.out.println(x);
		System.out.println(y.intValue());
		System.out.println(x + y.intValue());
		
		// Java 5(�t)����
		int a = 100;
		Integer b = 200; // Integer.valueOf(200); �ѽsĶ�����A�i�� auto-boxing (�۰ʸ˽c)
		System.out.println(a);
		System.out.println(b); // �sĶ���|�۰ʥ[�W b.intValue() ����k�I�s auto-unboxing (�۰ʩ�c)
		System.out.println(a + b); // �sĶ���|�۰ʥ[�W b.intValue() ����k�I�s auto-unboxing (�۰ʩ�c)
		

	}

}
