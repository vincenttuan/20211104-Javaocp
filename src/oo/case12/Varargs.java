package oo.case12;

public class Varargs {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		int[] values = {10, 20, 30};
		System.out.println(calc.add(values));
		
		System.out.println(calc.add(10, 20));
		
		System.out.println(calc.add(10, 20, 30, 40));
		
		System.out.println(calc.add(10));
		
		System.out.println(calc.add());
	}

}
