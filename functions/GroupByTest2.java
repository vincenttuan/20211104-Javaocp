package functions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByTest2 {
	public static void main(String[] args) {

		List<Integer> scores = Arrays.asList(100, 40, 70, 80, 90, 30, 20, 55, 35);
		System.out.println(scores);
		// 及格(true/pass)與不及格(false/fail)的分類
		
		Map<Boolean, Long> result = scores.stream()
								.collect(Collectors.groupingBy(score->score>=60, Collectors.counting()));
		
		System.out.println(result); // {false=5, true=4}
		
		Map<String, Long> result2 = scores.stream()
				.collect(Collectors.groupingBy(score->score>=60?"pass":"fail", Collectors.counting()));
		System.out.println(result2); // {fail=5, pass=4}
		
		Function<Integer, String> func = score->score>=60?"pass":"fail";
		Map<String, Long> result3 = scores.stream()
				.collect(Collectors.groupingBy(func, Collectors.counting()));
		System.out.println(result3); // {fail=5, pass=4}
		
	}
}
