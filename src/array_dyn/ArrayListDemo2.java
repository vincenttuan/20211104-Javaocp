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
	}

}
