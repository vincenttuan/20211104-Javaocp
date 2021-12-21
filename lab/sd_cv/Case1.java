package lab.sd_cv;

import java.util.stream.DoubleStream;

/*
 * �լd����ǥͤ��������魫�p�U�A�դ��������{�סC
 * �����G172�B168�B164�B170�B176(����)
 * �魫�G62�B57�B58�B64�B64(����)
 * */
public class Case1 {
	public static void main(String[] args) {
		double[] heights = {172, 168, 164, 170, 176};
		double[] weights = {62, 57, 58, 64, 64};
		
		// �p��зǮt
		// �p�⥭��
		double hAvg = DoubleStream.of(heights).average().getAsDouble();
		double wAvg = DoubleStream.of(weights).average().getAsDouble();
		
		// �p�⨭���зǮt
		double h_cum = 0;
		for(double h : heights) {
			h_cum += Math.pow(h-hAvg, 2);
		}
		double h_sd = Math.sqrt(h_cum/heights.length); 
		
		// �p���魫�зǮt
		double w_cum = 0;
		for(double w : weights) {
			w_cum += Math.pow(w-wAvg, 2);
		}
		double w_sd = Math.sqrt(w_cum/weights.length);
		
		System.out.println("���� SD: " + h_sd);
		System.out.println("�魫 SD: " + w_sd);
		
		// �p�⨭���P�魫���ܲ��Y��
		double h_cv = h_sd / hAvg;
		double w_cv = w_sd / wAvg;
		System.out.println("���� CV: " + h_cv);
		System.out.println("�魫 CV: " + w_cv);
		
		// �����{��
		String result = h_cv > w_cv ? "����" : "�魫";
		System.out.println(result + "�������{�פj");		
	}
}
