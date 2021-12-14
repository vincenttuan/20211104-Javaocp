package array_dyn;

import java.util.ArrayList;

// ArrayList �@�ض��X(�ʺA�}�C)
public class ArrayListDemo {
	public static void main(String[] args) {
		// �إߤ@�ӥH Integer(���) ���������e����ƶ��X
		// �Ҧp: [2, 3, 4, 5, 6, 7]
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2); // �s�W�@�� Integer 2 ������, auto-boxing
		nums.add(Integer.valueOf(3));
		nums.add(4); // �۷�� Integer.valueOf(4)
		nums.add(5); // �۷�� Integer.valueOf(5)
		nums.add(6); // �۷�� Integer.valueOf(6)
		nums.add(7); // �۷�� Integer.valueOf(7)
		System.out.println(nums);
		// ���o���, �z�L index
		System.out.println(nums.get(0));
		// �R��
		nums.remove(2); // ������m index = 2 �����
		System.out.println(nums);
		// �ڭn�R�����e = 5 ������
		nums.remove(Integer.valueOf(5));
		System.out.println(nums);
		
	}
}
