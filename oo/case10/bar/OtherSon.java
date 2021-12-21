package oo.case10.bar;

import oo.case10.foo.Father;

public class OtherSon extends Father {
	public void exec() {
		play();
		asset(); // 要透過繼承才可以使用 Father 的 asset() 方法 (權限: protected)
	}
}
