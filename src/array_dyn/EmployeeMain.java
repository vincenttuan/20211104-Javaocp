package array_dyn;

public class EmployeeMain {
	
	public static void main(String[] args) {
		EmployeeCRUD crud = new EmployeeCRUD();
		crud.create(new Employee(101, "John"));
		crud.create(new Employee(102, "Mary"));
		crud.create(new Employee(103, "Bobo"));
		System.out.println(crud.queryAll());
		
		// 員編 101 的姓名要改為 Jack 
		crud.update(101, "Jack");
		System.out.println(crud.queryAll());
		
		// 刪除 員編 101
		crud.delete(101);
		System.out.println(crud.queryAll());
	}

}
