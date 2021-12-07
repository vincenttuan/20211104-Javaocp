package oo.case7;

public class Cat {
	static int count; // 累計數量
	String name; // 貓名
	int age; // 貓齡
	
	Cat() {
		System.out.println("增加一隻貓");
		count++;
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
	
}
