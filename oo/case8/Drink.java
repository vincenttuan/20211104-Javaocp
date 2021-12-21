package oo.case8;

public class Drink {
	private int amount; // �ƶq
	private int size;   // �ؤo
	private int total;  // �`���B
	
	Drink() {
		
	}
	
	Drink(int amount, int size) {
		setAmount(amount);
		setSize(size);
		getTotal();
	}
	
	public void setAmount(int num) {
		if(num > 0 && num <= 100) {
			amount = num;
		}
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getTotal() {
		int total = amount * size;
		this.total = total;
		return total;
	}
	
	
	@Override
	public String toString() {
		return "Drink [amount=" + amount + ", size=" + size + ", total=" + total + "]";
	}
	
	
}

