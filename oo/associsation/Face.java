package oo.associsation;

public class Face {
	Mouth mouth;
	Face() {
		mouth = new Mouth();
	}
	// 外觀
	public void appearance() {
		System.out.println("眼耳鼻口");
	}
}
