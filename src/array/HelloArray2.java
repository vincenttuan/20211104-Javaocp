package array;

public class HelloArray2 {

	public static void main(String[] args) {
		int[] scores = {100, 90, 80, 75};
		// �Q�� for loop �N��ƥ����L�X part 1
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		
		// �Q�� for loop �N��ƥ����L�X part 2
		int lens = scores.length;
		for(int i=0;i<lens;i++) {
			System.out.println(scores[i]);
		}
		
		// �Q�� for loop �N��ƥ����L�X part 3
		for(int i=0, lenss=scores.length;i<lenss;i++) {
			System.out.println(scores[i]);
		}
		
		// �Q�� for-each(in) �N��ƥ����L�X part 4
		// �M���w�ﶰ�X�ʪ���ƶi�����
		for(int x: scores) {
			System.out.println(x);
		}
		
	}

}
