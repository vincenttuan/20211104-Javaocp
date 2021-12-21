package oo.overloading;

public class Overloading {
	int x(int d) {
		System.out.println("One");
		return 0;
	}
	
	String x(String d) {
		System.out.println("Two");
		return null;
	}
	
	double x(double d) {
		System.out.println("Three");
		return 0.0;
	}
	
	public static void main(String[] args) {
		Overloading o1 = new Overloading();
		o1.x(10);
		
		new Overloading().x("10");
		new Overloading().x(10.0);
	}
	
}
