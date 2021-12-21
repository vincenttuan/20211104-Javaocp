package wrapper;

public class Case1 {

	public static void main(String[] args) {
		//  int 程
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		
		String x = "100";
		String y = "80";
		System.out.println(x + y);
		// ﹃锣计
		int a = Integer.parseInt(x); // 盢 "100" 跑Θ 100
		int b = Integer.parseInt(y); // 盢 "80" 跑Θ 80
		System.out.println(a + b);
		
		String height = "170.0";
		String weight = "60.5";
		// ― bmi = ?
		double h = Double.parseDouble(height);
		double w = Double.parseDouble(weight);
		double bmi = w / Math.pow(h/100, 2);
		System.out.println(bmi);
		
		// 计(疊翴计)锣﹃
		int d = 100;
		int e = 80;
		String f = String.valueOf(d) + String.valueOf(e);
		System.out.println(f);
		
		String g = d + "" + e;
		System.out.println(g);
		
	}

}
