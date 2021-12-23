package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3 {
	public static void main(String[] args) {
		// 單元素
		// 泛型 <>
		// 限制元素的資料型別
		Set<Integer> scores = new HashSet<>();
		scores.add(100);
		scores.add(100); // 重複的元素不會納入
		scores.add(100); // 重複的元素不會納入
		scores.add(90);
		scores.add(80);
		System.out.println(scores);
		// scores.add("國文"); // 因為泛型<Integer>限制, 所以不可加入 String
		int sum = 0;
		Iterator<Integer> iter = scores.iterator();
		while (iter.hasNext()) {
			sum += iter.next();
		}
		System.out.println(sum);
		
	}
}
