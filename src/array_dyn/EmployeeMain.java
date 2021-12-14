package array_dyn;

public class EmployeeMain {
	
	public static void main(String[] args) {
		EmployeeCRUD crud = new EmployeeCRUD();
		crud.create(new Employee(101, "John"));
		crud.create(new Employee(102, "Mary"));
		crud.create(new Employee(103, "Bobo"));
		System.out.println(crud.queryAll());
		
		// ���s 101 ���m�W�n�אּ Jack 
		crud.update(101, "Jack");
		
		System.out.println(crud.queryAll());
	}

}
