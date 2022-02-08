package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// 來源 "src/io/files/news.txt"
		try(FileReader fr = new FileReader("src/io/files/news.txt");
			BufferedReader br = new BufferedReader(fr);) {
			
			String data = null;
			while ((data = br.readLine()) != null) { // 逐行讀取 ! null 表示讀到檔尾
				System.out.println(data);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
