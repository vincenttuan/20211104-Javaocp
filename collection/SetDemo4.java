package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo4 {
	public static void main(String[] args) {
		// 複合元素
		Exam e1 = new Exam("國文", 100);
		Exam e2 = new Exam("數學", 100);
		Exam e3 = new Exam("英文", 90);
		
		Set<Exam> exams = new HashSet<>();
		exams.add(e1);
		exams.add(e2);
		exams.add(e3);
		
		System.out.println(exams);
		
		// 求總分 = ?
		
	}
}

