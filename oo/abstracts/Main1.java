package oo.abstracts;

public class Main1 {
	public static void main(String[] args) {
		ADog d1 = new Shiba();
		ADog d2 = new Chihuahua();
		Dog d3 = new Edog();
		d1.eat();d1.play();
		d2.eat();d2.play();
		d3.eat();d3.play();
		// �N�Ҧ�����@�_
		Dog[] dogs = {d1, d2, d3};
		
		// �N�Ҧ�������@�_
		ADog[] aDogs = {d1, d2};
		
	}
}
