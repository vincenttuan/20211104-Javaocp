package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
		// 單元素
		// HashSet 的元素按照 Hash 值來擺放
		Set set = new HashSet();
		set.add("國文"); // String
		set.add(Integer.valueOf(100));   // Integer
		set.add("數學");
		set.add(90);
		set.add("英文");
		set.add(80);
		System.out.println(set);
		
		// 計算本次考試總分 = ?
		int sum = 0;
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			Object object = iter.next();
			if(object instanceof Integer) {
				System.out.println(object);
				sum += (Integer)object;
			}
		}
		System.out.println(sum);
		
	}
}
