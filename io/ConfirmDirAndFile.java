package io;

import java.io.File;
import java.util.Arrays;

public class ConfirmDirAndFile {

	public static void main(String[] args) {
		// 確認是路徑還是檔案
		File basePath = new File("src/io");
		String[] names = basePath.list();
		System.out.println(Arrays.toString(names));
		
		for(String name : names) {
			File newPath = new File(basePath + "/" + name);
			System.out.printf("%s 是%s\n", newPath, (newPath.isDirectory()?"資料夾":"檔案"));
		}

	}

}
