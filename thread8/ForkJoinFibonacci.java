package thread8;

import java.util.Date;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinFibonacci extends RecursiveTask<Long> {
	private static final long THRESHOLD = 10;
	private Long number;
	
	public ForkJoinFibonacci(Long number) {
		this.number = number;
	}
	
	public Long getNumber() {
		return number;
	}
	
	@Override
	protected Long compute() {
		long n = number;
		if(n < THRESHOLD) { // 若小於門檻值則進行傳統解法
			number = fib(n);
		} else {
			ForkJoinFibonacci f1 = new ForkJoinFibonacci(n-1);
			ForkJoinFibonacci f2 = new ForkJoinFibonacci(n-2);
			ForkJoinTask.invokeAll(f1, f2);
			number = f1.number + f2.number;
		}
		return number;
	}

	//---------------------------------------------------------
	
	// 傳統解法
	private static long fib(long n) {
		/*
		if(n < 2) 
			return n;
		else
			return fib(n-1) + fib(n-2);
		*/
		return (n < 2) ? n : fib(n-1) + fib(n-2);
	}
	
	// 主程式
	public static void main(String[] args) {
		System.out.printf("開始時間: %s\n", new Date());
		long n = 56;
		System.out.printf("第 %d 項 = %d\n", n, fib(n));
		System.out.printf("結束時間: %s\n", new Date());
	}

	
}
