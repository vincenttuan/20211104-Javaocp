package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo2 {

	public static void main(String[] args) {
		// normalize() = 路徑正常化, 去除冗於路徑
		Path path = Paths.get("C:/temp/aaa/../bbb/ccc/hello.txt").normalize();
		System.out.println(path);
		// relativize() = 路徑切換
		Path path1 = Paths.get("src/home/happy");
		Path path2 = Paths.get("src/home/foo/bar");
		System.out.printf("path1: %s\n", path1);
		System.out.printf("path2: %s\n", path2);
		Path path1_to_path2 = path1.relativize(path2);
		System.out.printf("path1 切換到 path2: %s\n", path1.relativize(path2));
		Path path2_to_path1 = path2.relativize(path1);
		System.out.printf("path2 切換到 path1: %s\n", path2.relativize(path1));
	}

}
