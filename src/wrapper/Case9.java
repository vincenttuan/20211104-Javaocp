package wrapper;

import java.util.Arrays;

public class Case9 {

	public static void main(String[] args) {
		int[][] scores = {
								{100, 90}, 
								{80, 70, 60}
							 };
		// �D�`��
		int sum = Arrays.stream(scores)
					.flatMapToInt(s -> Arrays.stream(s)) // �N�@��}�C���y�}�C
					.sum();
		System.out.println(sum);
		
	}

}
