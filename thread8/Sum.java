package thread8;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class Sum extends RecursiveAction {
	static final int THRESHOLD_SIZE = 3; // 門檻值
	int stIndex, lstIndex;
	int[] data;
	
	public Sum(int[] data, int start, int end) {
		this.data = data;
		this.stIndex = start;
		this.lstIndex = end;
	}
	
	@Override
	protected void compute() {
		int sum = 0;
		if(lstIndex - stIndex <= THRESHOLD_SIZE) {
			for(int i=stIndex;i<lstIndex;i++) {
				sum += data[i];
			}
			System.out.println(sum);
		} else {
			//new Sum(data, stIndex + THRESHOLD_SIZE, lstIndex).fork();
			//new Sum(data, stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE)).compute();
			Sum s1 = new Sum(data, stIndex + THRESHOLD_SIZE, lstIndex);
			Sum s2 = new Sum(data, stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE));
			ForkJoinTask.invokeAll(s1, s2);
		}
	}
	
}
