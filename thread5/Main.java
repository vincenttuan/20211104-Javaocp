package thread5;

public class Main {

	public static void main(String[] args) {
		Cookie cookie = new Cookie();
		Thread master = new Thread(new Master(cookie));
		Thread dog = new Thread(new Dog(cookie));
		
		master.start();
		dog.start();

	}

}
