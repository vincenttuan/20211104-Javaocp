package oo.case10.bar;

import oo.case10.foo.Father;

public class OtherSon extends Father {
	public void exec() {
		play();
		asset(); // �n�z�L�~�Ӥ~�i�H�ϥ� Father �� asset() ��k (�v��: protected)
	}
}
