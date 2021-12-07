package oo.overloading;

// 加法計算機
public class Calc {
	
	public Integer add(Integer x, Integer y) {
		System.out.println("2.");
		return x + y;
	}
	
	/*
	public int add(int x, int y) {
		System.out.println("1.");
		return x + y;
	}
	*/
	public double add(double x, double y) {
		System.out.println("3.");
		return x + y;
	}
	
}
