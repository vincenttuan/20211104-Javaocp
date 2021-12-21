package oo.extend2;

public class Bird extends Animal {
	
	public Bird() {
		
	}
	
	public Bird(String name) {
		this(name, 2); // 呼叫 Bird 自己的建構子
	}
	
	public Bird(String name, int legs) {
		super(name, legs); // 呼叫 Animal 建構子
	}
	
	@Override
	public void move() {
		System.out.println("飛");
	}

	@Override
	public String toString() {
		return "Bird [name=" + getName() + ", legs=" + getLegs() + "]";
	}
	
	
	
}
