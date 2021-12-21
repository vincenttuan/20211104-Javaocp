package oo.innerclass3;

public class Test {

	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.callMe();
		
		Outer.SInner sin = new Outer.SInner();
		sin.callMe();

	}

}
