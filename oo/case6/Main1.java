package oo.case6;

public class Main1 {

	public static void main(String[] args) {
		Dog.legs = 4;
		
		Dog d1 = new Dog();
		d1.age = 30;
		d1.kind = "�Ԥ��Ԧh";
		
		Dog d2 = new Dog();
		d2.age = 2;
		d2.kind = "���";
		
		System.out.println(d1);
		System.out.println(d2);

	}

}
