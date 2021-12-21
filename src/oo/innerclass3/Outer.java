package oo.innerclass3;

public class Outer {
	static int x = 100;
	int y = 200;
	class Inner {
		void callMe() {
			System.out.println("Inner callMe()");
			System.out.printf("x = %d\n", Outer.x);
			System.out.printf("y = %d\n", Outer.this.y);
			System.out.printf("z = %d\n", SInner.z);
		}
	}
	
	static class SInner {
		static int z = 300;
		static void callMe() {
			System.out.println("SInner callMe()");
			System.out.printf("x = %d\n", Outer.x);
			// 無法直接取用 y
			System.out.printf("z = %d\n", SInner.z);
		}
	}
}
