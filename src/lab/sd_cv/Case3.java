package lab.sd_cv;

/*
 * �Y���q��18����u�A
 * �䤤 10 ��b�h�~���Ѳ��A�@�~����Q�v�p�U(���G%)�G
 * 7.6 3.9 15.6 28.3 1.2 10.8 35.3 45.6 10.2 0.5
 * 
 * �t�~ 8 ����u���R���Ť@�~����Q�v�p�U(���G%)
 * 6.8 7.2 6.8 7.5 6.9 7.9 7.9 7.1 7.2
 * �դ��O�D�����q�����u���Ѳ��P���Ū���Q�v�ܲ��Y�� ? �P��ا�����í�� ?
 * */
public class Case3 {

	public static void main(String[] args) {
		double[] stocks = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};  
		double[] bonds = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
		Calc calc = new Calc();
		double stock_cv = calc.getCV(stocks); 
		double bond_cv = calc.getCV(bonds);
		System.out.println("�Ѳ� CV: " + stock_cv);
		System.out.println("�Ũ� CV: " + bond_cv);
		String result = stock_cv < bond_cv?"�Ѳ�":"�Ũ�";
		System.out.println(result + "������í��");
	}

}
