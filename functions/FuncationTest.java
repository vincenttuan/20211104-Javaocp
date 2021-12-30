package functions;

import java.util.function.Function;

/*
	@FunctionalInterface
	public interface Function<T,R> {
    	R apply(T t);
	}
*/
public class FuncationTest {

	public static void main(String[] args) {
		// 得到某一個字串的長度
		//Function<String, Integer> func = (x) -> {return x.length();};
		Function<String, Integer> func = (x) -> x.length();
		
		Integer lens = func.apply("HelloWorld");
		System.out.println(lens);
	}

}
