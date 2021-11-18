package wrapper;

import java.util.Arrays;

public class Case10 {

	public static void main(String[] args) {
		Integer[][] scores = {
								{100, 90}, 
								{80, 70, 60},
							 };
		// 求總分
		int sum = Arrays.stream(scores)
				.flatMapToInt(s -> Arrays.stream(s).mapToInt(a->a)) // 將一般陣列轉串流陣列
				.sum();
		System.out.println(sum);
		
	}

}
