package pattern.decorator;

public class Bread extends Food {
	
	public Bread() {
		name = "�ѥ]";
		price = 40;
	}
	
	@Override
	public String getName() {
		return name + "(" + price + ")";
	}

	@Override
	public int getPrice() {
		return price;
	}
	
}
