package oo.case2;

public class Employee {
	String name; // �m�W
	int salary; // �~��
	String language; // �u�@���ϥΪ��{���y��
	
	// �غc�l (�غc = new)
	Employee(String n, int s, String l) {
		name = n;
		salary = s;
		language = l;
	}
	
	Employee() {
		
	}
	
	// ��k
	@Override // �мg
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", language=" + language + "]";
	}
	
	
}
