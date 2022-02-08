package io;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		// 建立檔案
		// 在 src/io/files 下建立 news.txt 檔案
		File file = new File("src/io/files/news.txt");
		System.out.printf("%s 是否存在: %b\n", file, file.exists());
		if(!file.exists()) {
			try {
				boolean success = file.createNewFile();
				System.out.printf("success: %b\n", success);
			} catch (IOException e) {
				System.out.printf("建檔錯誤原因: %s\n", e);
			}
			
		}
		
	}
}
