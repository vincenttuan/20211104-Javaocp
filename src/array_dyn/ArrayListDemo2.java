package array_dyn;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "John");
		Employee e2 = new Employee(102, "Mary");
		Employee e3 = new Employee(201, "Bobo");
		
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(new Employee(301, "Helen"));
		
		System.out.println(emps);
		
		// ���o index = 1 �����u����
		System.out.println(emps.get(1));
		
		// �Ч�X ���s = 201 ���m�W = ?
		for(Employee emp : emps) {
			if(emp.getNum() == 201) {
				System.out.println(emp.getName());
				break;
			}
		}
		// �Ч�X �m�W=Helen �����s = ?
		for(Employee emp : emps) {
			if(emp.getName().equals("Helen")) {
				System.out.println(emp.getNum());
				break;
			}
		}
		// ���� index = 0 �����u
		emps.remove(0);
		System.out.println(emps);
		
		// �Q�n���� e2 = new Employee(102, "Mary");
		emps.remove(e2);
		System.out.println(emps);
		
		// �Q�n���� new Employee(301, "Helen");
		// ����� Helen ���u����
		Employee helen = null;
		for(Employee emp : emps) {
			if(emp.getName().equals("Helen")) {
				helen = emp;
				System.out.println("��� Helen: " + helen);
				break;
			}
		}
		emps.remove(helen);
		System.out.println(emps);
		
		// �Q�n���� bobo
		Employee bobo = new Employee(201, "Bobo");
		emps.remove(bobo);
		System.out.println(emps);
		
		
	}

}
