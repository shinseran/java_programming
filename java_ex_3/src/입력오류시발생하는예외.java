import java.util.Scanner;
import java.util.InputMismatchException;
public class 입력오류시발생하는예외 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum=0,n=0;
		for(int i=0;i<3;i++) {
			System.out.print(i+">>");
			try {
				n=scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다 다시입력하세요");
				scanner.next();//입력스트림에 있는 정수가 아닌 토큰을 버린다.
				i--;
				continue;
			}
			sum+=n;
		}
		System.out.println("합은"+sum);
		scanner.close();

	}

}
