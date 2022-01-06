package error_handle2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

// 網路爬蟲
public class WebCrawler {

	public static void main(String[] args) {
		String data = getWebData();
		System.out.println(data);
	}
	
	public static String getWebData() {
		String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
		String data = null;
		try {
			URL url = new URL(path);
			Scanner sc = new Scanner(url.openStream()).useDelimiter("\\A"); // \\A表示全選
			data = sc.next();
		} catch (MalformedURLException e) {
			System.out.println("網路格式錯誤:" + e);
		} catch (IOException e) {
			System.out.println("無法找到資料:" + e);
		}
		return data;
	}
	

}
