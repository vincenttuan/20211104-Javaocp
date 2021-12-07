package oo.case4;

public class ATM {
	public static void main(String[] args) {
		Account john = new Account("��v");
		Account mary = new Account("����");
		john.save(1_0000);
		mary.save(1_0000);
		System.out.println(john + ", " + mary);
		
		john.save(3000);
		mary.withdraw(6000);
		System.out.println(john + ", " + mary);
		
		// john �൹ mary 5000
		john.transfer(5000, mary);
		System.out.println(john + ", " + mary);
		
	}
}
