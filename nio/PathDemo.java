package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		Path path = Paths.get("src/nio/PathDemo.java");
		path.forEach(System.out::println);
		
		System.out.printf("getFileName: %s\n", path.getFileName());
		System.out.printf("getParent: %s\n", path.getParent());
		System.out.printf("getRoot: %s\n", path.getRoot()); // 相對路徑會得到 null, 絕對路徑會有資料
		// src/nio/PathDemo.java
		//  0   1    2
		// subpath(from, to)  範圍: from <= x < to
		System.out.printf("subpath(0, 2): %s\n", path.subpath(0, 2)); // src\nio
		System.out.printf("subpath(1, 3): %s\n", path.subpath(1, 3)); // nio\PathDemo.java
		System.out.printf("isAbsolute(): %s\n", path.isAbsolute()); // 是否是絕對路徑, 反之就是相對路徑
		System.out.printf("toAbsolutePath(): %s\n", path.toAbsolutePath()); // 取得絕對路徑
		System.out.printf("toUri(): %s\n", path.toUri()); // 轉換成 Uri 的格式
	}

}
