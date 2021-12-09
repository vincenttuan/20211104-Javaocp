package pattern.decorator;

public class Subway2 {
	public static void main(String[] args) {
		// �C����
		Food f1 = new Bread();
		f1 = new Tuna(f1);
		f1 = new Tomato(f1);
		f1 = new Lettuce(f1);
		f1 = new Onion(f1);
		f1 = new Olives(f1);
		System.out.println(f1.getName());
		
		// ���L��
		Food f2 = new Bread();
		f2 = new Ham(f2);
		f2 = new Lettuce(f2);
		f2 = new Onion(f2);
		System.out.println(f2.getName());
		
		// ���b
		Food[] foods = {f1, f2};
		// �Q�� java 8 �D foods �̭��G�ӳ����`��
		
		
		
	}
}
