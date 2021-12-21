package oo.abstracts;

public class Main1 {
	public static void main(String[] args) {
		ADog d1 = new Shiba();
		ADog d2 = new Chihuahua();
		Dog d3 = new Edog();
		d1.eat();d1.play();
		d2.eat();d2.play();
		d3.eat();d3.play();
		// 將所有狗放一起
		Dog[] dogs = {d1, d2, d3};
		
		// 將所有活狗放一起
		ADog[] aDogs = {d1, d2};
		
	}
}
