package nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewFileReaderDemo2 {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("src/nio/files/1000 Sales Records.csv");
		// Files.lines 會得到一格字串流 Stream<String>
		Files.lines(path)
			.filter(str -> str.contains("Taiwan"))
			.forEach(System.out::println);
	}

}
