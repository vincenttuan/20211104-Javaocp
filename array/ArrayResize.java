package array;

import java.util.Arrays;

public class ArrayResize {

	public static void main(String[] args) {
		// 陣列 Resize
		int[] a = {100, 90, 80};
		System.out.println(Arrays.toString(a));
		// 若我要再加入一個元素 70 ?
		int[] b = new int[4];
		// a copy to b
		for(int i=0;i<a.length;i++) {
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(b));
		// 放入 70
		b[3] = 70;
		System.out.println(Arrays.toString(b));
		// 將 b 所指向的陣列指派給 a
		a = b;
		System.out.println(Arrays.toString(a));
	}

}
