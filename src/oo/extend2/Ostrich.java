package oo.extend2;

public class Ostrich extends Bird {
	
	public Ostrich(String name) {
		super(name);
	}
	
	@Override
	public void move() {
		System.out.println("ил");
	}

	@Override
	public String toString() {
		return "Ostrich [name=" + getName() + ", legs=" + getLegs() + "]";
	}
	
	
}
