package array;

import java.util.stream.IntStream;

public class HelloArray6 {

	public static void main(String[] args) {
		int[] scores = {100, 90, 80, 75};
		// �D�`���P����(�p���I1��)
		int sum = 0;
		for(int s:scores) {
			sum += s;
		}
		System.out.printf("�`��: %d\n", sum);
		
		double avg = sum / (double)scores.length;
		System.out.printf("����: %.1f\n", avg);
		
		// Java 8
		sum = IntStream.of(scores).sum();
		avg = IntStream.of(scores).average().getAsDouble();
		System.out.printf("�`��: %d\n", sum);
		System.out.printf("����: %.1f\n", avg);
	}

}
