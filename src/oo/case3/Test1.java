package oo.case3;

public class Test1 {

	public static void main(String[] args) {
		Person p1 = new Person("John", 170, 60);
		System.out.println(p1);
		
		Person p2 = new Person();
		p2.name = "Mary";
		p2.height = 160;
		p2.weight = 50;
		System.out.println(p2);
		
	}

}
