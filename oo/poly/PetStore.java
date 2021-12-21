package oo.poly;

import java.util.Random;

public class PetStore {
	
	// �d�����եx
	public void play(Pet pet) {
		pet.shouting();
	}
	
	// ���ڤ@���d��
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
