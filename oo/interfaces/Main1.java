package oo.interfaces;

public class Main1 {
	public static void main(String[] args) {

		TV tv1 = new SonyTV();
		TV tv2 = new LGTV();
		TV[] tvs = { tv1, tv2 };

		// 打開電視
		tv1.powerOn();
		// 選台
		tv1.setChannel(3);
		// 調整聲音
		tv1.setVolume(8);
		// 印出 TV 狀態資料
		System.out.printf("%s 解析度: %s 目前台號: %d 目前音量: %d\n", 
				tv1.getClass().getSimpleName(), tv1.getResolution(),tv1.getChannel(), tv1.getVolume());
		
		// 打開電視
		tv2.powerOn();
		// 選台
		tv2.setChannel(5);
		// 調整聲音
		tv2.setVolume(3);
		// 印出 TV 狀態資料
		System.out.printf("%s 解析度: %s 目前台號: %d 目前音量: %d\n", 
				tv2.getClass().getSimpleName(), tv2.getResolution(), tv2.getChannel(), tv2.getVolume());
		
		// 關閉電視
		tv1.powerOff();
		tv2.powerOff();
	}
}
