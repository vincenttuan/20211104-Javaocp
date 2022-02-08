package io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileWriterDemo2 {
	// FileWriter 使用 try-with-resource 語法
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("src/io/files/news.txt", true)) { // true 表示保留舊資料加入, false 表示清除舊資料後加入(預設)
			fw.write("現在時間: " + new Date());
			fw.write("\n");
			System.out.println("寫檔完成");
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}
