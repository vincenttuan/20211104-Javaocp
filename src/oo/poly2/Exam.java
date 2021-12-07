package oo.poly2;

class Alpha {
	public String doStuff(String msg) {
		return msg;
	}
}

class Beta extends Alpha {
	public String doStuff(String msg) {
		return msg.replace('a', 'e');
	}
}

class Gamma extends Beta {
	public String doStuff(String msg) {
		return msg.substring(2); // �L�X�ĤG�Ӧr���᪺��� Ex: Java �o�� va 
	}
}



public class Exam {
	public static void main(String[] args) {
		Alpha[] alphas = {new Alpha(), new Beta(), new Gamma()};
		for(Alpha a : alphas) {
			System.out.println(a.getClass().getName());
			System.out.println(a.getClass().getSimpleName());
			System.out.println(a.doStuff("Java"));
			System.out.println();
		}
	}
}
