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
		
		// 取得 index = 1 的員工物件
		System.out.println(emps.get(1));
		
		// 請找出 員編 = 201 的姓名 = ?
		for(Employee emp : emps) {
			if(emp.getNum() == 201) {
				System.out.println(emp.getName());
				break;
			}
		}
		// 請找出 姓名=Helen 的員編 = ?
		for(Employee emp : emps) {
			if(emp.getName().equals("Helen")) {
				System.out.println(emp.getNum());
				break;
			}
		}
		// 移除 index = 0 的員工
		emps.remove(0);
		System.out.println(emps);
		
		// 想要移除 e2 = new Employee(102, "Mary");
		emps.remove(e2);
		System.out.println(emps);
		
		// 想要移除 new Employee(301, "Helen");
		// 先找到 Helen 員工物件
		Employee helen = null;
		for(Employee emp : emps) {
			if(emp.getName().equals("Helen")) {
				helen = emp;
				System.out.println("找到 Helen: " + helen);
				break;
			}
		}
		emps.remove(helen);
		System.out.println(emps);
		
		// 想要移除 bobo
		Employee bobo = new Employee(201, "Bobo");
		emps.remove(bobo);
		System.out.println(emps);
		
		
	}

}
