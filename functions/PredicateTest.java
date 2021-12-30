package functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
/*
	@FunctionalInterface
	public interface Predicate<T> {
    	boolean test(T t);
	}
*/
public class PredicateTest {

	public static void main(String[] args) {
		// 判斷分數是否及格
		Predicate<Integer> predicate = (x) -> x >= 60;
		boolean pass = predicate.test(87);
		System.out.println(pass);
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(list);
		
		// 取的偶/奇數資料集合 java 8
		Predicate<Integer> even = x -> x % 2 == 0;
		Predicate<Integer> odd  = x -> x % 2 == 1;
		Predicate<Integer> greaterThen5  = x -> x > 5;
		
		List<Integer> evenList = list.stream()
					.filter(even)
					.filter(greaterThen5)
					.collect(toList());
		System.out.println(evenList);
		
		// 取的偶數資料集合 java 7
		List<Integer> evenList2 = new ArrayList<>();
		for(Integer i : list) {
			if(i % 2 == 0) {
				evenList2.add(i);
			}
		}
		System.out.println(evenList2);
	}

}
