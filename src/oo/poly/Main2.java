package oo.poly;

public class Main2 {
	public static void main(String[] args) {
		PetStore petStore = new PetStore();
		Cat cat = new Cat();
		petStore.play(cat);
		
		Pet pet = petStore.getPet();
		if(pet != null) {
			pet.shouting();
		} else {
			System.out.println("»ÊÁÂ´fÅU");
		}
	}
}
