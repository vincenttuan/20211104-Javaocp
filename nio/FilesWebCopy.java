package nio;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesWebCopy {
	public static void main(String[] args) throws IOException {
		String imageUrl = "https://www.foreignersintaiwan.com/uploads/5/4/3/2/54326073/carshn-1_orig.jpg";
		URI uri = URI.create(imageUrl);
		Path dest = Paths.get("src/nio/files/car.jpg");
		InputStream in = uri.toURL().openStream();
		Files.copy(in, dest, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Download ok");
	}
}
