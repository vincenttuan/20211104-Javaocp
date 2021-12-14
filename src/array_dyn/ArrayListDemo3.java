package array_dyn;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		Gift g1 = new Gift(1, "�S��", 1);
		Gift g2 = new Gift(2, "�Y��", 2);
		Gift g3 = new Gift(3, "�L��", 4);
		Gift g4 = new Gift(4, "�T��", 10);
		Gift g5 = new Gift(5, "�|��", 50);
		Gift g6 = new Gift(6, "����", 100);
		ArrayList<Gift> gifts = new ArrayList<>();
		gifts.add(g1);
		gifts.add(g2);
		gifts.add(g3);
		gifts.add(g4);
		gifts.add(g5);
		gifts.add(g6);
		System.out.println("���~:" + gifts);
		System.out.println("����:" + gifts.size());
		// �аݨC�@�Ӽ������ƶq�U���h�� ?
		for (Gift gift : gifts) {
			System.out.printf("%s �� %d ��\n", gift.getName(), gift.getCount());
		}
		// ��� "�L��", �ñN count �� 1
		// �o�� "�L��" ����
		Gift gift = null;
		for (Gift g : gifts) {
			if (g.getName().equals("�L��")) {
				gift = g;
				break;
			}
		}
		System.out.println("�L������: " + gift);
		// �L������ count - 1
		gift.setCount(gift.getCount() - 1);
		// �аݨC�@�Ӽ������ƶq�U���h�� ?
		for (Gift g : gifts) {
			System.out.printf("%s �� %d ��\n", g.getName(), g.getCount());
		}
	}

}
