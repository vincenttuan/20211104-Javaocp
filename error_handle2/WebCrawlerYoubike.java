package error_handle2;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/*
sno(站點代號)、sna(中文場站名稱)、tot(場站總停車格)、sbi(可借車位數)、
sarea(中文場站區域)、mday(資料更新時間)、lat(緯度)、lng(經度)、ar(中文地址)、
sareaen(英文場站區域)、snaen(英文場站名稱)、aren(英文地址)、bemp(可還空位數)、
act(場站是否暫停營運)
*/
public class WebCrawlerYoubike {
	public static void main(String[] args) throws IOException {
		String data = getWebData();
		JsonElement jelement = JsonParser.parseString(data);
		JsonObject root = jelement.getAsJsonObject();
		JsonObject retVal = root.getAsJsonObject("retVal");
		int my_sbi = 40; // 可借
		int my_bemp = 40; // 可還
		for(int i=2001;i<=2425;i++) {
			JsonObject station = retVal.getAsJsonObject(i+"");
			if(station != null) {
				int sbi = station.get("sbi").getAsInt();
				int bemp = station.get("bemp").getAsInt();
				if(sbi >= my_sbi && bemp >= my_bemp) {
					System.out.println(station);
				}
			}
		}
	}
	
	public static String getWebData() throws IOException {
		String path = "https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=5ca2bfc7-9ace-4719-88ae-4034b9a5a55c&rid=a1b4714b-3b75-4ff8-a8f2-cc377e4eaa0f";
		URL url = new URL(path);
		Scanner sc = new Scanner(url.openStream()).useDelimiter("\\A");
		return sc.next();
	}
}
