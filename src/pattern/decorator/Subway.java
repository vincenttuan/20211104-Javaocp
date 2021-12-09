package pattern.decorator;

public class Subway {
	public static void main(String[] args) {
		Food food = new Bread();
		food = new Ham(food);
		food = new Lettuce(food);
		food = new Onion(food);
		food = new Olives(food);
		food = new Tomato(food);
		food = new Tuna(food);
		food = new Tuna(food);
		food = new Onion(food);
		food = new Onion(food);
		
		// 總共加了哪些食材 ?
		System.out.println(food.getName());
		// 費用
		System.out.println(food.getPrice());
		
		
		
	}
}
