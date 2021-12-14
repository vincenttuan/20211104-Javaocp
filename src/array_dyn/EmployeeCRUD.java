package array_dyn;

import java.util.ArrayList;

public class EmployeeCRUD implements CRUD<Employee> {
	// 存放員工物件的動態陣列
	private static ArrayList<Employee> employees = new ArrayList<>();
	
	@Override
	public void create(Employee e) {
		employees.add(e);
	}

	@Override
	public void update(Employee e) {
		
	}

	@Override
	public void delete(Integer num) {
		
	}

	@Override
	public Employee getOne(Integer num) {
		Employee employee = null;
		for(Employee e : employees) { // 根據員編找到員工
			if(e.getNum() == num) {
				employee = e;
				break;
			}
		}
		return employee;
	}

	@Override
	public Employee getOne(String name) {
		Employee employee = null;
		for(Employee e : employees) { // 根據姓名找到員工
			if(e.getName().equals(name)) {
				employee = e;
				break;
			}
		}
		return employee;
	}

	@Override
	public ArrayList<Employee> queryAll() {
		return employees;
	}

	
	
}
