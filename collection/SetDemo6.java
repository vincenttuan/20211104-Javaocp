package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo6 {
	public static void main(String[] args) {
		// 複合元素
		// 若要剔除重複的元素, 則 Exam 必須實作 equals() 與 hashCode()
		Exam e1 = new Exam("國文", 100);
		Exam e2 = new Exam("數學", 100);
		Exam e3 = new Exam("英文", 90);
		Exam e4 = new Exam("英文", 90);

		Set<Exam> exams = new LinkedHashSet<>();
		exams.add(e1);
		exams.add(e2);
		exams.add(e3);
		exams.add(e4);
		
		System.out.println(exams.size()); // 元素個數
		System.out.println(exams);
	}
}
