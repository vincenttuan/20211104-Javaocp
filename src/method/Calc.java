package method;

public class Calc {
	// �]�p�@�� add ��k
	// x, y ��ܩұa�J���Ѽ�
	// return �^��
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// �]�p�@�� bmi �p���k
	// h, w ��ܨ���,�魫���Ѽ�
	// return bmi����
	public double getBMI(double h, double w) { // ��kñ�� API
		double bmi = w / Math.pow(h/100, 2);
		return bmi;
	}
	
	// �]�p�@�ӭp�� int[] �}�C�`��������k
	// ���@�� int[] �Ѽ�
	// return int ���G
	public int getSum(int[] scores) {
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		return sum;
	}
	
	// �g�@�� welcome ��k (�L�^�ǭ� void)
	// ���@�� name �� String �Ѽ�
	// return; �Τ��g�]�i�H
	public void welcome(String name) {
		System.out.println("�w��" + name + "�Y�{����");
	}
	
	public void welcome() {
		System.out.println("�w��z�Y�{����");
		return; // �i�g�i���g
	}
	 
	
}
