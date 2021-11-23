package oo.case8;

import java.util.Arrays;

public class DrinkStore {

	public static void main(String[] args) {
		// �ڭn�R "3" �M "��" �M�����ƻ���O�h�� ?
		Drink drink = new Drink();
		//drink.amount = -3;
		drink.setAmount(3);
		//drink.size = Size.M;
		drink.setSize(Size.M);
		//drink.total = 0;
		System.out.println(drink.getTotal());
		System.out.println(drink);
		
		//-----------------------------------
		
		Drink drink2 = new Drink(20, Size.L);
		System.out.println(drink2);
		
		//-----------------------------------
		
		Drink[] drinks = {
				new Drink(10, Size.S),
				new Drink(20, Size.XL),
				new Drink(30, Size.XXL),
				new Drink(40, Size.M),
				new Drink(50, Size.L),
		};
		// �ШD�X�`���B ?
		System.out.println(Arrays.toString(drinks));
		
		// Java 7
		int sum = 0;
		for(Drink d: drinks) {
			sum += d.getTotal();
		}
		System.out.println(sum);
		
		// Java 8
		int sum2 = Arrays.stream(drinks)
				.mapToInt(d -> d.getTotal())
				.sum();
		System.out.println(sum2);

	}

}
