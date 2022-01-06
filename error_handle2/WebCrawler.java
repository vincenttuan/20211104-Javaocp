package error_handle2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;

// 網路爬蟲
public class WebCrawler {

	public static void main(String[] args) {
		String data = getWebData();
		Rice[] rices = getRices(data);
		System.out.printf("資料筆數: %d\n", rices.length);
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入品名關鍵字:");
		String keyword = sc.next();
		for(Rice rice : rices) {
			if(rice.品名.contains(keyword)) {
				System.out.printf("不合格品名: %s 不合格原因: %s\n",
								  rice.品名, rice.不合格原因);
			}
		}
	}
	
	public static Rice[] getRices(String jsonstr) {
		Gson gson = new Gson();
		Rice[] rices = gson.fromJson(jsonstr, Rice[].class);
		return rices;
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
