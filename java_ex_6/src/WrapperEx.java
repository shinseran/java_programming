
public class WrapperEx {

	public static void main(String[] args) {
		
			System.out.println(Character.toLowerCase('A'));//A�� �ҹ��ڷ� ��ȯ
			char c1='4' , c2='F';
			if(Character.isDigit(c1))//���� c1�� �����̸� true
			 System.out.println(c1+"�� ����");                              //4�� ����
			 if(Character.isAlphabetic(c2))//���� c2�� �������̸� true;
				 System.out.println(c2+"�� ������");                          //F�� ������
			 
			 System.out.println(Integer.parseInt("-123"));//-123�� 10������ ��ȯ     -123
			 System.out.println(Integer.toHexString(28));//28�� 2���� ���ڿ��� ��ȯ         1c
			 System.out.println(Integer.toBinaryString(28));//28�� 16���� ���ڿ��� ��ȯ       11100
			 System.out.println(Integer.bitCount(28));//28�� ���� 2������ 1�� ����          3
			 
			 Double d = Double.valueOf(3.14);
			 System.out.println(d.toString());//������ ���ڿ� 3.14�� ��ȯ             3.14
			 System.out.println(Double.parseDouble("3.14"));//���ڿ��� �Ǽ� 3.14�� ��ȯ           3.14
			 
			 boolean b=(4>3);//b�� true
			 System.out.println(Boolean.toString(b));//true�� ���ڿ� true�� ��ȯ         true
			 System.out.println(Boolean.parseBoolean("false"));//���ڿ��� false�� ��ȯ   false
				 
				
		

	}

}
