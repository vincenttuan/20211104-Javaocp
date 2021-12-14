package array_dyn;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		Gift g1 = new Gift(1, "特獎", 1);
		Gift g2 = new Gift(2, "頭獎", 2);
		Gift g3 = new Gift(3, "貳獎", 4);
		Gift g4 = new Gift(4, "三獎", 10);
		Gift g5 = new Gift(5, "四獎", 50);
		Gift g6 = new Gift(6, "五獎", 100);
		ArrayList<Gift> gifts = new ArrayList<>();
		gifts.add(g1);
		gifts.add(g2);
		gifts.add(g3);
		gifts.add(g4);
		gifts.add(g5);
		gifts.add(g6);
		System.out.println("獎品:" + gifts);
		System.out.println("獎項:" + gifts.size());
		// 請問每一個獎項的數量各有多少 ?
		for (Gift gift : gifts) {
			System.out.printf("%s 有 %d 個\n", gift.getName(), gift.getCount());
		}
		// 抽到 "貳獎", 並將 count 減 1
		// 得到 "貳獎" 物件
		Gift gift = null;
		for (Gift g : gifts) {
			if (g.getName().equals("貳獎")) {
				gift = g;
				break;
			}
		}
		System.out.println("貳獎物件: " + gift);
		// 貳獎物件 count - 1
		gift.setCount(gift.getCount() - 1);
		// 請問每一個獎項的數量各有多少 ?
		for (Gift g : gifts) {
			System.out.printf("%s 有 %d 個\n", g.getName(), g.getCount());
		}
	}

}
