package functions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupByTest3 {

	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("apple", 10, 9.99),
				new Fruit("banana", 20, 19.99),
				new Fruit("orange", 10, 29.99),
				new Fruit("watermelon", 10, 29.99),
				new Fruit("papaya", 20, 9.99),
				new Fruit("apple", 10, 9.99),
				new Fruit("banana", 10, 19.99),
				new Fruit("apple", 20, 9.99)
		);
		System.out.println(fruits);
		// 1. 根據水果名分組
		Map<String, Long> result = fruits.stream()
						.collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));
		System.out.println(result);
		
		// 2. 根據水果名分組後每一種水果各有多少個
		Map<String, Integer> result2 = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getName, Collectors.summingInt(f->f.getQty())));
		System.out.println(result2);
		
		Map<String, Integer> result3 = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getName, Collectors.summingInt(Fruit::getQty)));
		System.out.println(result3);
		
		// 3. 根據價格 price 來分組
		Map<Double, Long> result4 = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getPrice, Collectors.counting()));
		System.out.println(result4);
		
		Map<Double, List<Fruit>> result5 = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getPrice));
		System.out.println(result5);
		
		// 19.99 = [banana], 29.99 = [orange, watermelon], 9.99 = [papaya, apple]
		Map<Double, List<String>> result6 = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getPrice, Collectors.mapping(Fruit::getName, Collectors.toList())));
		System.out.println(result6);
		
		Map<Double, Set<String>> result7 = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getPrice, Collectors.mapping(Fruit::getName, Collectors.toSet())));
		System.out.println(result7);
		
	}

}
