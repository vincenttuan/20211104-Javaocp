package wrapper;

import java.util.Arrays;

public class Case2 {

	public static void main(String[] args) {
		String[] scores = {"100", "90", "80"};
		// �D�`��=?
		// java 7
		int sum = 0;
		for(String score : scores) {
			System.out.println(score + ", " + score.getClass());
			sum += Integer.parseInt(score);
		}
		System.out.println(sum);
		// java 8
		int sum2 = Arrays.stream(scores).mapToInt(s -> Integer.parseInt(s)).sum();
		System.out.println(sum2);
	}

}
