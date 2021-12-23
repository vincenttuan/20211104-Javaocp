package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
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
		
		// 走訪元素內容 Iterator (一步一步做)
		Iterator iter = set.iterator();
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println("---------------");
		// 走訪元素內容 Iterator (使用 while)
		// 重新取得走訪器(iter)
		iter = set.iterator();
		while (iter.hasNext()) {
			//Object object = iter.next();
			System.out.println(iter.next());
		}
	}
}
