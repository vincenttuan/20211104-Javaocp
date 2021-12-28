package collection2;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		//Map<String, Integer> exams = new HashMap<>();
		Map<String, Integer> exams = new LinkedHashMap<>();
		exams.put("國文", 100);
		exams.put("數學", 100);
		exams.put("英文", 95);
		System.out.println(exams);
		// 總共考了哪幾科 ?
		Set<String> keys = exams.keySet();
		System.out.println(keys);
		// 請問數學幾分 ?
		System.out.println(exams.get("數學"));
		// 印出所有成績
		Collection<Integer> values = exams.values();
		System.out.println(values);
		// 求出總分
		int sum = 0;
		for(Integer score : values) {
			sum += score;
		}
		System.out.println(sum);
		// Java 8
		int sum2 = values.stream()
					.mapToInt(Integer::valueOf)
					.sum();
		System.out.println(sum2);
		
	}
}
