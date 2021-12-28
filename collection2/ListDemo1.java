package collection2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(100);
		list.add(0, 80);
		list.add(90);
		System.out.println(list);
		
		List<Integer> nums = new LinkedList<>();
		for(int i=1;i<=10;i++) {
			//nums.add(i);
			nums.add(0, i);
		}
		System.out.println(nums);
		
		// 利用 for-loop 取資料
		System.out.println("利用 for-loop 取資料:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		// 利用 for-in(each) 取資料
		System.out.println("利用 for-in(each) 取資料:");
		for(Integer i : list) {
			System.out.println(i);
		}
		// 利用 ListIterator 取資料
		System.out.println("利用 ListIterator next() 取資料:");
		ListIterator<Integer> iter = list.listIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("利用 ListIterator previous() 取資料:");
		while (iter.hasPrevious()) {
			System.out.println(iter.previous());
		}
	}

}
