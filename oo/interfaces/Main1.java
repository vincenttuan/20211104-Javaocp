package oo.interfaces;

public class Main1 {
	public static void main(String[] args) {

		TV tv1 = new SonyTV();
		TV tv2 = new LGTV();
		TV[] tvs = { tv1, tv2 };

		// ���}�q��
		tv1.powerOn();
		// ��x
		tv1.setChannel(3);
		// �վ��n��
		tv1.setVolume(8);
		// �L�X TV ���A���
		System.out.printf("%s �ѪR��: %s �ثe�x��: %d �ثe���q: %d\n", 
				tv1.getClass().getSimpleName(), tv1.getResolution(),tv1.getChannel(), tv1.getVolume());
		
		// ���}�q��
		tv2.powerOn();
		// ��x
		tv2.setChannel(5);
		// �վ��n��
		tv2.setVolume(3);
		// �L�X TV ���A���
		System.out.printf("%s �ѪR��: %s �ثe�x��: %d �ثe���q: %d\n", 
				tv2.getClass().getSimpleName(), tv2.getResolution(), tv2.getChannel(), tv2.getVolume());
		
		// �����q��
		tv1.powerOff();
		tv2.powerOff();
	}
}
