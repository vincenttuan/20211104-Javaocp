package wrapper;

import java.util.Arrays;

public class Case10 {

	public static void main(String[] args) {
		Integer[][] scores = {
								{100, 90}, 
								{80, 70, 60},
							 };
		// �D�`��
		int sum = Arrays.stream(scores)
				.flatMapToInt(s -> Arrays.stream(s).mapToInt(a->a)) // �N�@��}�C���y�}�C
				.sum();
		System.out.println(sum);
		
	}

}
