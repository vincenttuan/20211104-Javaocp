package oo.interfaces;

public class MySmartPhone implements SmartPhone {
	private int volume;
	private int channel;
	private boolean power;
	private String number;
	@Override
	public String getResolution() {
		return "4K";
	}

	@Override
	public void setVolume(int vol) {
		if(power) {
			volume = vol;
		}
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void powerOn() {
		power = true;
	}

	@Override
	public void powerOff() {
		power = false;
	}

	@Override
	public void setChannel(int no) {
		if(power) {
			channel = no;
		}
	}

	@Override
	public int getChannel() {
		return channel;
	}

	@Override
	public void dial() {
		System.out.printf("%s ����\n", number);
	}

	@Override
	public void setNumber(String number) {
		if(power) {
			this.number = number;
		}
	}

	@Override
	public String getNumber() {
		return number;
	}

	@Override
	public void download() {
		if(power) {
			System.out.println("�U�� APP...");
		}
	}
	
}
