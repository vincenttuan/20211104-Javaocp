package oo.innerclass2;

public class CalcTest {
	public static void main(String[] args) {
		// Java 7
		Calc c1 = new Calc() {
			public int func(int x, int y) {
				return x + y;
			}
		};
		System.out.println(c1.func(10, 20));
		
		// Java 8 Lambda
		Calc c2 = (int x, int y) -> x + y;
		System.out.println(c2.func(10, 20));
		
		Calc c3 = (x, y) -> x - y;
		System.out.println(c3.func(10, 20));
		
		Calc c4 = (int x, int y) -> {
			int sum = x * y;
			return sum;
		};
		System.out.println(c4.func(10, 20));
		
		//Calc c5 = (x, y) -> Math.max(x, y);
		Calc c5 = Math::max;
		//Calc c6 = (x, y) -> Math.min(x, y);
		Calc c6 = Math::min;
		
		System.out.println(c5.func(10, 20));
		System.out.println(c6.func(10, 20));
		
		
	}
}
