package array;

public class HelloArray2 {

	public static void main(String[] args) {
		int[] scores = {100, 90, 80, 75};
		// 利用 for loop 將資料全部印出 part 1
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		
		// 利用 for loop 將資料全部印出 part 2
		int lens = scores.length;
		for(int i=0;i<lens;i++) {
			System.out.println(scores[i]);
		}
		
		// 利用 for loop 將資料全部印出 part 3
		for(int i=0, lenss=scores.length;i<lenss;i++) {
			System.out.println(scores[i]);
		}
		
		// 利用 for-each(in) 將資料全部印出 part 4
		// 專門針對集合性的資料進行導覽
		for(int x: scores) {
			System.out.println(x);
		}
		
	}

}
