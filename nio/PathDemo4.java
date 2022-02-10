package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo4 {
	public static void main(String[] args) {
		// relative() 路徑切換
		// resolve() 路徑結合
		Path path1 = Paths.get("/app/files/");
		Path res1 = path1.resolve("log"); // 相對路徑結合
		System.out.println(res1);
		
		Path path2 = Paths.get("/web/files/");
		Path res2 = path2.resolve("/log"); // 絕對路徑結合
		System.out.println(res2);
		
	}
}
