package oo.overloading;

public class MainCalc {
	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.add(10.5, 20.5));
	}
}
