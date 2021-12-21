package array_dyn;

import java.util.Objects;

public class Gift {
	private Integer num;   // ����
	private String name;   // ���W
	private Integer count; // �ƶq
	
	public Gift() {
		
	}
	
	public Gift(Integer num, String name, Integer count) {
		this.num = num;
		this.name = name;
		this.count = count;
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

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(count, name, num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gift other = (Gift) obj;
		return Objects.equals(count, other.count) && Objects.equals(name, other.name) && Objects.equals(num, other.num);
	}

	@Override
	public String toString() {
		return "Gift [num=" + num + ", name=" + name + ", count=" + count + "]";
	}
	
	
	
	
}
