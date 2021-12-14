package array_dyn;

import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class EmployeeCRUD implements CRUD<Employee> {
	// �s����u���󪺰ʺA�}�C
	private static ArrayList<Employee> employees = new ArrayList<>();
	
	@Override
	public void create(Employee e) {
		employees.add(e);
	}

	@Override
	public void update(Employee e) {
		throw new RuntimeException("����k�b�����ϥ�");
	}
	
	// �M�ݵ� EmployeeCRUD �ҨϥΪ� Update
	public void update(Integer num, String name) {
		Employee emp = getOne(num);
		if(emp != null) {
			emp.setName(name);
			System.out.println("�ק令�\");
		} else {
			System.out.println("�ק異��: �L�����s");
		}
	}

	@Override
	public void delete(Integer num) {
		Employee emp = getOne(num);
		if(emp != null) {
			employees.remove(emp);
			System.out.println("�R�����\");
		} else {
			System.out.println("�R������: �L�����s");
		}
	}

	@Override
	public Employee getOne(Integer num) {
		Employee employee = null;
		for(Employee e : employees) { // �ھڭ��s�����u
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
		for(Employee e : employees) { // �ھکm�W�����u
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