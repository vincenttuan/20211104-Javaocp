package lab.sd_cv;

import java.util.stream.DoubleStream;

// ���ѼзǮt�P�ܲ��Y��
public class Calc {
	// 1. ���o�зǮt����k 
	public double getSD(double[] array) {
		double avg = getAvg(array);
		double cum = DoubleStream.of(array).map(x -> Math.pow(x-avg, 2)).sum();
		double sd = Math.sqrt(cum / array.length);
		return sd;
	}
	
	// 2. ���o�ܲ��Y�ƪ���k 
	public double getCV(double[] array) {
		double avg = getAvg(array);
		double sd = getSD(array);
		double cv = sd / avg;
		return cv;
	}
	
	// 3. ���o��������k
	public double getAvg(double[] array) {
		double avg = DoubleStream.of(array).average().getAsDouble();
		return avg;
	}
	
}
