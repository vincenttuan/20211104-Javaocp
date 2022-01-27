package thread8;

import java.util.concurrent.ForkJoinPool;

public class SumMain {

	public static void main(String[] args) {
		ForkJoinPool fjPool = new ForkJoinPool();
		int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		fjPool.invoke(new Sum(data, 0, data.length));
	}

}
