package oo.innerclass;

public class Outer {
	int x = 7; // Outer �������ܼ�
	
	public class Inner {
		int x = 77; // Inner �������ܼ� 
		
		public void callMe() {
			int x = 777; // ��k�ϰ��ܼ�
			System.out.println("Hello Inner");
			System.out.printf("��k�ϰ��ܼ� x = %d\n", x);
			System.out.printf("Inner �������ܼ� x = %d\n", this.x);
			System.out.printf("Outer �������ܼ� x = %d\n", Outer.this.x);
			
		}
	} 
	
}

