package thread3;

import java.util.concurrent.CyclicBarrier;

public class CarMain {
	public static void main(String[] args) {
		int parties = 4;
		CyclicBarrier cyclicBarrier = new CyclicBarrier(parties);
		
		Thread t1 = new Thread(new Car(cyclicBarrier), "A車");
		Thread t2 = new Thread(new Car(cyclicBarrier), "B車");
		Thread t3 = new Thread(new Car(cyclicBarrier), "C車");
		Thread t4 = new Thread(new Car(cyclicBarrier), "D車");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
