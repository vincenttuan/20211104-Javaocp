package wrapper;

import java.util.Arrays;

public class Case5 {
	public static void main(String[] args) {
		String[] scores = {"100", "-990", "95", null, "200", "", "84"};
		// �D0~100���� ���ƬO 5 �����ƪ��`�M = (���׬O 195)
		// java 8
		int sum = Arrays.stream(scores)
				        .filter(s -> s != null)
				        .filter(s -> !s.equals(""))
				        .mapToInt(s -> Integer.parseInt(s))
				        .filter(s -> (s >= 0 && s <= 100))
				        .filter(s -> s % 5 == 0)
				        .sum();
		System.out.println(sum);
				        
				        
	}
}
