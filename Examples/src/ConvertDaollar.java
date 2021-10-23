import java.util.Scanner;
abstract class Converter1 {
   abstract protected double convert(double src); // �߻� �޼ҵ�
   abstract protected String getSrcString(); // �߻� �޼ҵ�
   abstract protected String getDestString(); // �߻� �޼ҵ�
   protected double ratio; // ����
   public void run() {
      Scanner scanner = new Scanner(System.in);
      System.out.println(getSrcString()+"�� "+getDestString()+"�� �ٲߴϴ�.");
      System.out.print(getSrcString()+"�� �Է��ϼ���>> ");
      double val = scanner.nextDouble();
      double res = convert(val);
      System.out.println("��ȯ ���: "+res+getDestString()+"�Դϴ�");
      scanner.close();
   }
}
public class ConvertDaollar {
	public static void main(String args[]) {
		   Won2Dollar toDollar = new Won2Dollar(1200); // 1�޷��� 1200��
		   toDollar.run();
		}
}
class Won2Dollar extends Converter {
	   public Won2Dollar(double ratio) { this.ratio = ratio; }
	   protected double convert(double src) { return src/ratio; }
	   protected String getSrcString() { return "��"; }
	   protected String getDestString() { return "�޷�"; }
	}
