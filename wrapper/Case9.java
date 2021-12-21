package wrapper;

import java.util.Arrays;

public class Case9 {

	public static void main(String[] args) {
		int[][] scores = {
								{100, 90}, 
								{80, 70, 60}
							 };
		// 求總分
		int sum = Arrays.stream(scores)
					.flatMapToInt(s -> Arrays.stream(s)) // 將一般陣列轉串流陣列
					.sum();
		System.out.println(sum);
		
	}

}
