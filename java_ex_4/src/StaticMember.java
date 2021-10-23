import java.util.Scanner;

class CurrencyConvert{
	private static double rate;//한국원화에 대한 환율
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
		System.out.print("환율(1달러)>>");
		double rate=scanner.nextDouble();
		CurrencyConvert.setRate(rate);
		System.out.println("백만원은 $"+CurrencyConvert.toDollar(10000000)+"입니다");
		System.out.println("$100"+CurrencyConvert.toKWR(100)+"입니다");
		scanner.close();

	}

}
