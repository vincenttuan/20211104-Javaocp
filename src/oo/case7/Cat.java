package oo.case7;

public class Cat {
	static int count; // �֭p�ƶq
	String name; // �ߦW
	int age; // ����
	
	Cat() {
		System.out.println("�W�[�@����");
		count++;
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
	
}
