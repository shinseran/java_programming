import java.util.Scanner;
public class DivideZero {//0으로나눌떼 예외처리

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		while(true) {
			System.out.print("나뉨수를 입려하시오");
			int dividend=scanner.nextInt();
			System.out.print("나눔수를 입력하시오");
			int divisor=scanner.nextInt();
			try {
				System.out.println(dividend+"fmf"+divisor+"로 나누면 몫은"+dividend/divisor+"입니다.");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		
		
		
		

	}

}
