package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) {
		File sour = new File("src/io/files/news.txt");
		File dist = new File("src/io/files/backup.txt");
		
		try(FileReader fr = new FileReader(sour);
			FileWriter fw = new FileWriter(dist);) {
			
			char[] buffer = new char[1];
			while (fr.read(buffer) != -1) {
				fw.write(buffer);
			}
			
			System.out.println("備份完成");
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
