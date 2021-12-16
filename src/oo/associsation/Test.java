package oo.associsation;

public class Test {

	public static void main(String[] args) {
		Body body = new Body();
		body.appearance();
		body.face.appearance();
		body.face.mouth.appearance();
		for(Hand hand : body.hands) {
			hand.appearance();
		}
		
	}

}
