package collection2;

import java.util.LinkedList;
import java.util.Queue;

// 佇列: 先進先出
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("John");
		queue.offer("Mary");
		queue.offer("Bobo");
		System.out.println("排隊: " + queue);
		
		System.out.println("依序取出:");
		while (!queue.isEmpty()) {
			String name = queue.poll();
			System.out.println(name);
		}
		
		System.out.println("排隊: " + queue);
	}

}
