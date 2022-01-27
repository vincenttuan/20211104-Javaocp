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
