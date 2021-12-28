package collection2;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(1300, 5);
		System.out.printf("size: %d capacity: %d\n", v.size(), v.capacity());
		for(int i=1;i<=1300;i++) {
			v.add(1);
		}
		v.add(1); // 半路殺出
		System.out.printf("size: %d capacity: %d\n", v.size(), v.capacity());
		
	}

}
