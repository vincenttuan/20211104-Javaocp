package array;

import java.util.Arrays;

public class ArrayResize {

	public static void main(String[] args) {
		// �}�C Resize
		int[] a = {100, 90, 80};
		System.out.println(Arrays.toString(a));
		// �Y�ڭn�A�[�J�@�Ӥ��� 70 ?
		int[] b = new int[4];
		// a copy to b
		for(int i=0;i<a.length;i++) {
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(b));
		// ��J 70
		b[3] = 70;
		System.out.println(Arrays.toString(b));
		// �N b �ҫ��V���}�C������ a
		a = b;
		System.out.println(Arrays.toString(a));
	}

}
