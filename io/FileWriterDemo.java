package io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileWriterDemo {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/io/files/news.txt"); // 開啟檔案
			fw.write("現在時間: " + new Date());
			fw.write("\n");
			System.out.println("寫檔完成");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close(); // 關閉檔案
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
