package oo.case3;

public class Person {
	String name;
	double height;
	double weight;
	double bmi;
	
	// 建構子 1
	Person(String n, double h, double w) {
		name = n;
		height = h;
		weight = w;
		bmi = w / Math.pow(h/100, 2); // 自動算出
	}
	
	// 建構子 2
	Person() {
		
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + ", bmi=" + bmi + "]";
	}
	
	
}
