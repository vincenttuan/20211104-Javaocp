package functions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamTest1 {

	public static void main(String[] args) {
		// 分數
		List<Integer> scores = Arrays.asList(5, -7, 8, 8, 9, 11, 6, -3);
		// 正常分數是介於 0~10 之間
		// 請求出總分與平均
		System.out.println(scores);
		int sum = scores.stream()
				.filter(x -> x >= 0 && x <= 10)
				.peek(x -> System.out.println(x)) // 觀察 stream 裡面的資料
				.mapToInt(x -> x.intValue())  // 將 x 這個 Integer 物件變成 int
				.sum();
		
		System.out.println(sum);
		
		int sum2 = scores.stream()
				.filter(x -> x >= 0 && x <= 10)
				.peek(System.out :: println)
				.mapToInt(Integer :: intValue)
				.sum();
		System.out.println(sum2);
		
		double avg = scores.stream()
					.filter(x -> x >= 0 && x <= 10)
					.mapToInt(Integer :: intValue)
					.average()
					.getAsDouble();
		System.out.println(avg);
		
		// 利用統計物件
		IntSummaryStatistics stat = scores.stream()
									.filter(x -> x >= 0 && x <= 10)
									.mapToInt(Integer :: intValue)
									.summaryStatistics();
		System.out.println(stat);
		System.out.println(stat.getSum());
		System.out.println(stat.getAverage());
				
	}

}
