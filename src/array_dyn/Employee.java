package array_dyn;

public class Employee {
	private Integer num; // 員工編號
	private String name; // 員工姓名
	
	public Employee() {
		
	}
	public Employee(Integer num, String name) {
		this.num = num;
		this.name = name;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + "]";
	}
	
}
