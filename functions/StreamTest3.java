package functions;

import java.util.LinkedHashMap;
import java.util.Map;

public class StreamTest3 {
	public static void main(String[] args) {
		Map<String, Integer> exams = new LinkedHashMap<>();
		exams.put("國文", 100);
		exams.put("數學", 85);
		exams.put("英文", 90);
		// 利用 Java 8 Stream 求平均
		// 提示: 使用 exams.entrySet()
	}
}
