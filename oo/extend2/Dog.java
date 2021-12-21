package oo.extend2;

public class Dog extends Animal {
	@Override
	public void move() {
		System.out.println("¶]");
	}

	@Override
	public String toString() {
		return "Dog [name=" + getName() + ", legs=" + getLegs() + "]";
	}
	
}

