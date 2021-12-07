package oo.case3;

public class Person {
	// �ݩ�
	String name;
	double height;
	double weight;
	double bmi;
	
	// �غc�l 1
	Person(String n, double h, double w) {
		name = n;
		height = h;
		weight = w;
		bmi = w / Math.pow(h/100, 2); // �۰ʺ�X
	}
	
	// �غc�l 2
	Person() {
		
	}
	
	// ��k
	void calcBmi() {
		bmi = weight / Math.pow(height/100, 2); // �۰ʺ�X
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + ", bmi=" + bmi + "]";
	}
	
	
}
