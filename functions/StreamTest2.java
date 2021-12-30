package functions;

import java.util.Arrays;
import java.util.List;

public class StreamTest2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Helen", "Bob", "Jo");
		// 請問平均人名的長度 = ?
		double avg = names.stream()
					.mapToInt(String::length)
					.average()
					.getAsDouble();
		System.out.println(avg);
	}
}
