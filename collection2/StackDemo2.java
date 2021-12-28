package collection2;

import java.util.Stack;

public class StackDemo2 {
	public static void main(String[] args) {
		String msg = "Java";
		char[] chars = msg.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		for(char c : chars) {
			stack.push(c);
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}
}
