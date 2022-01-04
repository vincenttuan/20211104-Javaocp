package functions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByTest1 {

	public static void main(String[] args) {
		
		// 3 apple, 2 banana, 1 papaya, 1 orange
		List<String> fruits = Arrays.asList("apple", "orange", "banana",
							"apple", "papaya", "banana", "apple");
		System.out.println(fruits);
		
		// Collectors.groupingBy
		//根據水果名分類
		Map<String, Long> result = fruits.stream()
				.collect(Collectors.groupingBy(name->name, Collectors.counting()));
		System.out.println(result);
		
		Map<String, Long> result2 = fruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result2);
		
		//根據水果名的長度來分類
		Map<Integer, Long> result3 = fruits.stream()
				.collect(Collectors.groupingBy(name->name.length(), Collectors.counting()));
		System.out.println(result3);
		
		Map<Integer, Long> result4 = fruits.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(result4);
		
	}

}
