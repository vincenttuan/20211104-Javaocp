package oo.case8;

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

	}

}
