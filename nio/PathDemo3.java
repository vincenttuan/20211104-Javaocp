package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo3 {

	public static void main(String[] args) {
		// 路徑比較
		Path path1 = Paths.get("C:/temp/company/finance/salary.txt");
		Path path2 = Paths.get("C:/temp");
		Path path3 = Paths.get("finance/salary.txt");
		
		System.out.println(path1.startsWith(path2)); // startsWith 是否起始相同
		System.out.println(path1.startsWith(path3));
		
		System.out.println(path1.endsWith(path2)); // endsWith 是否結尾相同
		System.out.println(path1.endsWith(path3));
	}

}

