package wrapper;

import java.util.Arrays;

public class Case11 {

	public static void main(String[] args) {
		int[][][] scores = {{{100, 90, 80, 70}, {60, 50, 40, 30}}};
		// �D�`��
		int sum = Arrays.stream(scores)
					.flatMapToInt(s -> Arrays.stream(s).flatMapToInt(a-> Arrays.stream(a))) // �N�@��}�C���y�}�C
					.sum();
		System.out.println(sum);
		
	}

}
