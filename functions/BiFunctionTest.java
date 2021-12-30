package functions;

import java.util.function.BiFunction;

/*
	@FunctionalInterface
	public interface BiFunction<T, U, R> {
		R apply(T t, U u);
	}
*/
public class BiFunctionTest {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
		Integer result = add.apply(10, 20);
		System.out.println(result);
		
		// Lab: 請利用 BiFunction 寫一個計算 BMI 的程式
		BiFunction<Double, Double, Double> bmi = (h, w) -> w / Math.pow(h/100, 2);
		System.out.println(bmi.apply(170.0,  60.0));
		
		// 取最大值 (利用方法參考)
		//BiFunction<Integer, Integer, Integer> max = (a, b) -> Math.max(a, b);
		BiFunction<Integer, Integer, Integer> max = Math::max;
		System.out.println(max.apply(10, 30));
	}
}
