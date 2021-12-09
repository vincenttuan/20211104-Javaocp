package oo.abstracts2;

public class Fighter extends Airplane implements Weapen {

	@Override
	public void speed() {
		System.out.println("超音速");
	}

	@Override
	public void fire() {
		System.out.println("發射響尾蛇飛彈");
	}
	
}
