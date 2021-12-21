package oo.associsation;

public class Body {
	Face face;
	Hand[] hands;
	Body() {
		face = new Face();
		Hand left = new Hand();
		Hand right = new Hand();
		hands = new Hand[] {left, right};
	}
	// ¥~Æ[
	public void appearance() {
		System.out.println("¥Ö½§");
	}
}
