package oo.innerclass;

public class Outer {
	int x = 7; // Outer ン跑计
	
	public class Inner {
		int x = 77; // Inner ン跑计 
		
		public void callMe() {
			int x = 777; // よ猭跋办跑计
			System.out.println("Hello Inner");
			System.out.printf("よ猭跋办跑计 x = %d\n", x);
			System.out.printf("Inner ン跑计 x = %d\n", this.x);
			System.out.printf("Outer ン跑计 x = %d\n", Outer.this.x);
			
		}
	} 
	
}

