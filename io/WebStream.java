package io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class WebStream {

	public static void main(String[] args) throws Exception {
		// 從網路讀取影像並存檔
		// 1. https://www.babycentre.co.uk/ims/2013/10/159450328_wide.jpg 讀取影像資料
		// 2. 將所讀取影像資料寫入到指定檔案中.例如: src/io/files/baby.jpg
		String webPath = "https://www.babycentre.co.uk/ims/2013/10/159450328_wide.jpg";
		URL url = new URL(webPath);
		InputStream is = url.openStream();
		System.out.println(is.available() + " bytes");
		
		FileOutputStream fos = new FileOutputStream("src/io/files/baby.jpg");
		
		byte[] buffer = new byte[1];
		while (is.read(buffer) != -1) { // 資料讀進 buffer
			fos.write(buffer); // 將 buffer 資料寫入
		}
		
		System.out.println("寫檔完成");
	}

}
