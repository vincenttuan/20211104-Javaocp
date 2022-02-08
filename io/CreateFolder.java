package io;

import java.io.File;

public class CreateFolder {
	
	public static void main(String[] args) {
		// 建立資料夾
		// 在 src/io 目錄下建立 files 資料夾
		File folder = new File("src/io/files");
		System.out.printf("%s 是否存在: %b\n", folder, folder.exists());
		if(!folder.exists()) {
			// 建立資料夾
			boolean success = folder.mkdir();
			System.out.printf("success: %b\n", success);
		}
		
	}

}
