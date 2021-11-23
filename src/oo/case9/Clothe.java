package oo.case9;

public class Clothe {
	final static String brandName = "HandTen";
	private int size = Size.M;
	private int amount = 1;
	private int total = size * amount;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size == Size.L || size == Size.M || size == Size.S) {
			this.size = size;
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		if(amount > 0 && amount <= 10) {
			this.amount = amount;
		}
	}

	public int getTotal() {
		total = amount * size;
		return total;
	}


	@Override
	public String toString() {
		return "Clothe [size=" + size + ", amount=" + amount + ", total=" + total + "]";
	}
	
	
}
