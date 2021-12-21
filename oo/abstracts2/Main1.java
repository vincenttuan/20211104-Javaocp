package oo.abstracts2;

import java.util.Arrays;

public class Main1 {
	public static void main(String[] args) {
		// 所有能夠提供的武器一起發射
		Weapon w1 = new Tank();
		Weapon w2 = new Fighter();
		Weapon[] weapons = {w1, w2};
		
		Arrays.stream(weapons).forEach(w -> w.fire());
		
		Arrays.stream(weapons).forEach(Weapon::fire);
	}
}
