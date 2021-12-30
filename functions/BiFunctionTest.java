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
		
	}
}
