package wrapper;

public class Case1 {

	public static void main(String[] args) {
		// ���X int ���̤j��
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		
		String x = "100";
		String y = "80";
		System.out.println(x + y);
		// �r����Ʀr
		int a = Integer.parseInt(x); // �N "100" �ܦ� 100
		int b = Integer.parseInt(y); // �N "80" �ܦ� 80
		System.out.println(a + b);
		
		String height = "170.0";
		String weight = "60.5";
		// �D bmi = ?
		double h = Double.parseDouble(height);
		double w = Double.parseDouble(weight);
		double bmi = w / Math.pow(h/100, 2);
		System.out.println(bmi);
		
		// �Ʀr(�]�]�t�B�I��)��r��
		int d = 100;
		int e = 80;
		String f = String.valueOf(d) + String.valueOf(e);
		System.out.println(f);
		
		String g = d + "" + e;
		System.out.println(g);
		
	}

}
