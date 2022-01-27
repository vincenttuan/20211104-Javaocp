# Javaocp20211104
Javaocp20211104 (Java 認證班)

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class ForkJoinFibonacci extends RecursiveTask<Long> {

    private static final long threshold = 10;
    private volatile long number;

    public ForkJoinFibonacci(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    @Override
    protected Long compute() {
        long n = number;
        if (n <= threshold) {
            number = fib(n);
        } else {
        	
            ForkJoinFibonacci f1 = new ForkJoinFibonacci(n - 1);
            ForkJoinFibonacci f2 = new ForkJoinFibonacci(n - 2);
            ForkJoinTask.invokeAll(f1, f2);
            number = f1.number + f2.number;
            
        	/*
        	ForkJoinFibonacci f1 = new ForkJoinFibonacci(n - 1);
        	f1.fork();
            ForkJoinFibonacci f2 = new ForkJoinFibonacci(n - 2);
            number = f2.compute() + f1.join();
            */
        }
        return number;
    }

    private static long fib(long n) {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    }
    
    public static void main(String[] args) {

        ForkJoinFibonacci task = new ForkJoinFibonacci(20);
        new ForkJoinPool().invoke(task);

        System.out.println(task.getNumber());

    }

}
    
//----------------------------------------------------------
    
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class Sum extends RecursiveAction{
    final int A = 3; // 門檻值
    int stIndex, lstIndex;
    int[] data;

    public Sum(int[] data, int start, int end) {
        this.stIndex = start;
        this.lstIndex = end;
        this.data = data;
    }
    
    @Override
    protected void compute() {
        if(lstIndex - stIndex <= A) { // 小於或等於門檻值就直接求解
            int sum = 0;
            for(int i=stIndex;i<lstIndex;i++) {
                sum += data[i];
            }
            System.out.printf("sum: %d\n", sum);
        } else { // 進行拆分
            //new Sum(data, stIndex+A, lstIndex).fork();
            //new Sum(data, stIndex, Math.min(lstIndex, stIndex+A)).compute();
        	Sum s1 = new Sum(data, stIndex+A, lstIndex);
        	Sum s2 = new Sum(data, stIndex, Math.min(lstIndex, stIndex+A));
        	ForkJoinTask.invokeAll(s1, s2);
        }
    }
    
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ForkJoinPool fjp = new ForkJoinPool();
        Sum sum = new Sum(data, 0, data.length);
        fjp.invoke(sum);
    }
    
}
