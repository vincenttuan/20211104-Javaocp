package nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NewFileReaderDemo {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("src/nio/files/1000 Sales Records.csv");
		// 1. BufferedReader + FileReader
		try(FileReader fr = new FileReader(path.toFile());
			BufferedReader br = new BufferedReader(fr);) {
			
			//br.lines().forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 2. Files.newBufferedReader(path)
		try(BufferedReader br = Files.newBufferedReader(path)) {
			
			//br.lines().forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 3. Files.readAllLines (將資料讀入到 List<String> 集合中)
		List<String> list = Files.readAllLines(path);
		//list.stream().forEach(System.out::println);
		
		// 4. Files.lines 會得到一格字串流 Stream<String>
		Files.lines(path).forEach(System.out::println);
	}
	

}
