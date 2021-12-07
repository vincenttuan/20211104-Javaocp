package wrapper;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Case6 {

	public static void main(String[] args) {
		int[] scores = {100, 80, 90};
		// ―じ计 = 3
		// ―程 = 100
		// ―程 = 80
		// ―羆だ = 270
		// ―キА = 90.0
		
		// java 8 (参璸瞇Α)
		IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
		System.out.println(stat);
		System.out.println("―じ计 = " + stat.getCount());
		System.out.println("―程 = " + stat.getMax());
		System.out.println("―程 = " + stat.getMin());
		System.out.println("―羆だ = " + stat.getSum());
		System.out.println("―キА = " + stat.getAverage());

	}

}
