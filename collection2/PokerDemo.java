package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PokerDemo {

	public static void main(String[] args) {
		Stack<String> poker = new Stack<>();
		poker.push("A");
		
		for(int i=2 ; i<=10 ; poker.push(i++ +"")) ; 
		
		poker.push("J");
		poker.push("Q");
		poker.push("K");
		
		System.out.println(poker);
		// 洗牌
		Collections.shuffle(poker);
		System.out.println(poker);
		
		// 取前二張
		List<String> hand = new ArrayList<>();
		hand.add(poker.pop());
		hand.add(poker.pop());
		
		System.out.println("hand: " + hand);
		System.out.println("poker: " + poker);
		
	}

}
