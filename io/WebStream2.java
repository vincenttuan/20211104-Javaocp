package io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class WebStream2 {

	public static void main(String[] args) throws Exception {
		// 從網路讀取影像並存檔
		// 1. https://images3.kingautos.net/2020/09/16/jVAL8U7ar93UP0F.jpg 讀取影像資料
		// 2. 將所讀取影像資料寫入到指定檔案中.例如: src/io/files/car.jpg
		String webPath = "https://images3.kingautos.net/2020/09/16/jVAL8U7ar93UP0F.jpg";
		URL url = new URL(webPath);
		InputStream is = url.openStream();
		System.out.println(is.available() + " bytes");
		
		FileOutputStream fos = new FileOutputStream("src/io/files/car.jpg");
		
		byte[] buffer = new byte[1];
		while (is.read(buffer) != -1) { // 資料讀進 buffer
			fos.write(buffer); // 將 buffer 資料寫入
		}
		
		System.out.println("寫檔完成");
	}

}
