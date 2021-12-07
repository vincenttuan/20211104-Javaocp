package oo.interfaces;

public class MyPhone implements Phone {
	private String number;
	@Override
	public void dial() {
		if(number != null && number.length() == 10) {
			System.out.printf("%s �}�l����...\n", number);
		} else {
			System.out.println("�Х��]�w�X�k������X");
		}
	}

	@Override
	public void setNumber(String number) {
		if(number != null && number.length() == 10) {
			this.number = number;
		} else {
			System.out.println("������X�]�w���~");
		}
	}

	@Override
	public String getNumber() {
		return number;
	}
	
}
