package io;

import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		// 讀取資料
		try(FileReader fr = new FileReader("src/io/files/news.txt")) {
			char[] buffer = new char[1];
			while(fr.read(buffer) != -1) {  // fr.read(buffer) 將資料讀進 buffer 中, -1 表示讀到檔尾
				System.out.print(buffer[0]);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
