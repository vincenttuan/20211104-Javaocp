package oo.extend2;

public class Bird extends Animal {
	
	public Bird() {
		
	}
	
	public Bird(String name) {
		this(name, 2); // �I�s Bird �ۤv���غc�l
	}
	
	public Bird(String name, int legs) {
		super(name, legs); // �I�s Animal �غc�l
	}
	
	@Override
	public void move() {
		System.out.println("��");
	}

	@Override
	public String toString() {
		return "Bird [name=" + getName() + ", legs=" + getLegs() + "]";
	}
	
	
	
}
