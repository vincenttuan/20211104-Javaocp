package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FilesCopyAndDelete {
	public static void main(String[] args) {
		Path source = Paths.get("src/nio/files/1000 Sales Records.csv");
		Path dest = Paths.get("src/nio/files/backup 1000 Sales Records.csv");
		
		try {
			Files.copy(source, dest);
			System.out.println("Copy OK!");
		} catch (Exception e) {
			System.out.println("檔案已存在 ! 無法 copy. " + e);
			Scanner scanner = new Scanner(System.in);
			System.out.print("是否要強制 copy, 要的話請輸入 y : ");
			if(scanner.next().equals("y")) {
				try {
					Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
					System.out.println("Replace Copy OK!");
				} catch (IOException e2) {
					System.out.println(e2);
				}
			}
		}
		
	}
}
