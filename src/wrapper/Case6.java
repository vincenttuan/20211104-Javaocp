package wrapper;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Case6 {

	public static void main(String[] args) {
		int[] scores = {100, 80, 90};
		// �D�����Ӽ� = 3
		// �D�̤j�� = 100
		// �D�̤p�� = 80
		// �D�`�� = 270
		// �D���� = 90.0
		
		// java 8 (�έp�[��)
		IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
		System.out.println(stat);
		System.out.println("�D�����Ӽ� = " + stat.getCount());
		System.out.println("�D�̤j�� = " + stat.getMax());
		System.out.println("�D�̤p�� = " + stat.getMin());
		System.out.println("�D�`�� = " + stat.getSum());
		System.out.println("�D���� = " + stat.getAverage());

	}

}
