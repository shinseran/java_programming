import java.util.Scanner;
public class DivideZero {//0���γ����� ����ó��

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		while(true) {
			System.out.print("�������� �Է��Ͻÿ�");
			int dividend=scanner.nextInt();
			System.out.print("�������� �Է��Ͻÿ�");
			int divisor=scanner.nextInt();
			try {
				System.out.println(dividend+"fmf"+divisor+"�� ������ ����"+dividend/divisor+"�Դϴ�.");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
		}
		
		
		
		

	}

}
