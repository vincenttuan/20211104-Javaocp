package oo.poly;

public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.shouting();
		Cat cat = new Cat();
		cat.shouting();
		Tiger tiger = new Tiger();
		tiger.shouting();
		tiger.hunt();
		//---------------------------------
		Cat cat2 = new Tiger();
		cat2.shouting();
		((Tiger)cat2).hunt(); // �z�L�૬�өI�s hunt()
	}

}
