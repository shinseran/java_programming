import java.util.Scanner;

class CurrencyConvert{
	private static double rate;//�ѱ���ȭ�� ���� ȯ��
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate =r;
	}
}
public class StaticMember {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("ȯ��(1�޷�)>>");
		double rate=scanner.nextDouble();
		CurrencyConvert.setRate(rate);
		System.out.println("�鸸���� $"+CurrencyConvert.toDollar(10000000)+"�Դϴ�");
		System.out.println("$100"+CurrencyConvert.toKWR(100)+"�Դϴ�");
		scanner.close();

	}

}
