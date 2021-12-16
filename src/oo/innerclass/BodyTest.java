package oo.innerclass;

public class BodyTest {

	public static void main(String[] args) {
		Body body = new Body();
		body.appearance();
		
		Body.Face face = body.new Face();
		face.appearance();
		
		Body.Face.Mouth mouth = face.new Mouth();
		mouth.appearance();
		
		Body.Hands hands = body.new Hands();
		hands.appearance();
		
		
	}

}
