package oo.innerclass2;

public class DogTest {

	public static void main(String[] args) {
		Dog dog = new DogImpl();
		dog.skill();
		
		Dog dog2 = new Dog() {
			public void skill() {
				System.out.println("½æµÞ");
			}
		};
		dog2.skill();
		
		Dog dog3 = new Dog() {
			public void skill() {
				System.out.println("®³³ø¯È");
			}
		};
		dog3.skill();
		
		
		

	}

}
