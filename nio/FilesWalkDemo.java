package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FilesWalkDemo {
	static int count = 0;
	public static void main(String[] args) throws Exception {
		// Files.walk(path) 尋訪目錄包含子目錄 => 遍歷目錄檔案
		Stream<Path> files = Files.walk(Paths.get("src"));
		files.forEach(path -> {
			try {
				Path aPath = path.toAbsolutePath();
				System.out.print(path + ": 建立時間: ");
				System.out.println(Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
				if(path.toString().contains(".java")) {
					count++;
				}
				System.out.println(count);
			} catch (IOException e) {
				System.out.println(e);
			}
		});
		System.out.println(count);
	}

}
