package lab.sd_cv;

/*
 * �լd����ǥͤ��������魫�p�U�A�դ��������{�סC
 * �����G172�B168�B164�B170�B176(����)
 * �魫�G62�B57�B58�B64�B64(����)
 * */
public class Case2 {
	public static void main(String[] args) {
		double[] heights = {172, 168, 164, 170, 176};
		double[] weights = {62, 57, 58, 64, 64};
		
		// �p���ܲ��Y��
		Calc calc = new Calc();
		double h_cv = calc.getCV(heights);
		double w_cv = calc.getCV(weights);
		System.out.println("���� CV: " + h_cv);
		System.out.println("�魫 CV: " + w_cv);
		
		// ��������{��
		String result = h_cv > w_cv ? "����" : "�魫";
		System.out.println(result + "�������{�פj");
	}
}
