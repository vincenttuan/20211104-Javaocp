package wrapper;

import java.util.Arrays;

public class Case3 {

	public static void main(String[] args) {
		String[] scores = {"100", "90", null, "80"};
		// �D�`��=?
		// java 7
		int sum = 0;
		for(String score : scores) {
			if(score != null) { // �L�o filter
				sum += Integer.parseInt(score); // �ഫ mapToInt
			}
		}
		System.out.println(sum);
		// java 8
		int sum2 = Arrays.stream(scores) // �إߦ�y
						 .filter(s -> s != null) // �L�o filter
						 .mapToInt(s -> Integer.parseInt(s)) // �ഫ mapToInt
						 .sum(); // �o���`�M
		System.out.println(sum2);
	}

}
