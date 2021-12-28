package collection2;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("John");
		stack.push("Mary");
		stack.push("Bobo");
		System.out.println("資料內容: " + stack);
		while (!stack.isEmpty()) {
			String name = stack.pop();
			System.out.println(name);
		}
		System.out.println("資料內容: " + stack);

	}

}
