package oo.extend2;

public class Main2 {

	public static void main(String[] args) {
		Bird bird = new Bird("�դ峾", 2);
		// �Q�n�L�X "�դ峾�� 2 ���}"
		System.out.println(bird);
		bird.move();
		
		Ostrich ostrich = new Ostrich("�k��");
		System.out.println(ostrich);
		ostrich.move();
		
	}

}
