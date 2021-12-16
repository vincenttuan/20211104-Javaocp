package oo.innerclass2;

public class DogTest {

	public static void main(String[] args) {
		Dog dog = new DogImpl();
		dog.skill();
		
		Dog dog2 = new Dog() {
			public void skill() {
				System.out.println("���");
			}
		};
		dog2.skill();
		
		Dog dog3 = new Dog() {
			public void skill() {
				System.out.println("������");
			}
		};
		dog3.skill();
		
		
		

	}

}
