package oo.case3;

public class Test1 {

	public static void main(String[] args) {
		Person p1 = new Person("John", 170, 60);
		System.out.println(p1);
		
		Person p2 = new Person();
		p2.name = "Mary";
		p2.height = 160;
		p2.weight = 50;
		//p2.bmi = p2.weight / Math.pow(p2.height/100, 2);
		p2.calcBmi(); // �I�s�@�ӥi�H�p�� bmi ����k
		System.out.println(p2);
		
	}

}
