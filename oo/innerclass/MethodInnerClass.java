package oo.innerclass;

// �@��~�����O
public class MethodInnerClass {
	// ��k
	public void appearance() {
		// x �Y�n����k�������O�ϥ�, �h�����O final 
		// Java 8 �H�e�n���T�ŧi final
		// Java 8(�t)�H��h����
		int x = 100; // ��k�ϰ��ܼ�
		//x = 101; // �]����k�������O���ϥ� x , �ҥH x �N�ܦ� final �ܼ�, �]�� x �Ȥ��i�ק�
		// ��k�������O
		class Inner {
			void callMe() {
				System.out.println("Hello Inner method");
				System.out.println("��k�ϰ��ܼ� x=" + x);
			}
		}
		// �إ߹���
		Inner in = new Inner();
		in.callMe();
	}
}