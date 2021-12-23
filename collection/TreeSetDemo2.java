package collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		// 建立元素使用 LinkedHashSet
		Set<Integer> nums = new LinkedHashSet<>();
		nums.add(1);
		nums.add(3);
		nums.add(2);
		System.out.println("nums:" + nums);
		
		// 查詢元素使用 TreeSet
		Set<Integer> treeNums = new TreeSet<>(nums);
		System.out.println("treeNums:" + treeNums);
		
		System.out.println("新增 4");
		// 新增 4
		nums.add(4);
		// 查詢 treeNums
		treeNums = new TreeSet<>(nums);
		System.out.println("treeNums:" + treeNums);
		
		
	}
}
