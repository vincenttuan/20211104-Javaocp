package oo.poly;

import java.util.Random;

public class PetStore {
	
	// 寵物測試台
	public void play(Pet pet) {
		pet.shouting();
	}
	
	// 給我一隻寵物
	public Pet getPet() {
		Random r = new Random();
		int n = r.nextInt(4); // 0, 1, 2, 3
		switch (n) {
			case 0:
				return new Dog();
			case 1:
				return new Cat();
			case 2:
				return new Tiger();	
			default:
				return null;
		}
	}
	
}
