package oo.innerclass2;

public class Calc2Test {

	public static void main(String[] args) {
		// 圓面積
		Calc2 circleArea = (r, pi) -> r * r * pi;
		System.out.println(circleArea.func(10, Math.PI));
		
		// 球體積
		Calc2 volume = (r, pi) -> 4/3.0 * pi * Math.pow(r, 3);
		System.out.println(volume.func(10, Math.PI));
		
		// 次方 1
		Calc2 pow = (n, power) -> Math.pow(n, power);
		System.out.println(pow.func(2, 3));
		
		// 次方 2
		Calc2 pow2 = Math::pow;
		System.out.println(pow2.func(2, 3));
		
		// 計算 bmi
		Calc2 bmi = (h, w) -> w / Math.pow(h/100, 2);
		System.out.println(bmi.func(170, 6));
		
		Calc2 bmi2 = (double h, double w) -> {
			double bmiValue = w / Math.pow(h/100, 2);
			return bmiValue;
		};
		System.out.println(bmi2.func(170, 6));
				
		
	}

}
