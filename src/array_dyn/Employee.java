package array_dyn;

public class Employee {
	private Integer num; // ���u�s��
	private String name; // ���u�m�W
	
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
