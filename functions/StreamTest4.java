package functions;

import java.util.Arrays;
import java.util.List;

class Salary {
	private Integer money;

	public Salary(Integer money) {
		this.money = money;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}
	
}

public class StreamTest4 {
	public static void main(String[] args) {
		List<Salary> salaries = Arrays.asList(new Salary(50000), new Salary(60000), new Salary(90000)); 
		// 求平均薪資
		double avg = salaries.stream()
					.mapToInt(Salary::getMoney) // x -> x.getMoney()
					.average().getAsDouble();
		System.out.println(avg);
	}
}
