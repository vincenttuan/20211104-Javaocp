package oo.enums;

public class PositionTest {

	public static void main(String[] args) {
		int bonus = 5000;
		printBonus(Position.��z, bonus);
		printBonus(Position.�M��, bonus);
		
		printBonus(6, bonus);
		printBonus(2, bonus);
		
		printBonus(100, bonus);
		printBonus(-100, bonus);
	}
	
	public static void printBonus(int pos, int bonus) {
		int real_bonus = pos * bonus;
		System.out.println(real_bonus);
	}

}
