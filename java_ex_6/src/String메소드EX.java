
public class String�޼ҵ�EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= new String("C#");
		String b = new String(",C++");
		
		System.out.println(a+"�� ���̴� "+a.length()); //���ڿ� ����  C#�� ���̴�3
		System.out.println(a.contains("#")); //���ڿ� ���԰���  true
		
		a=a.concat(b);
		System.out.println(a);//���ڿ� ����   C#.C++
		
		a=a.trim();
		System.out.print(a);//���ڿ� �� ���� �������� C#,C++
		
		a=a.replace("C#","Java");
		System.out.println(a); //���ڿ� ��ġ Java,C++
		
		String s[] = a.split(",");//���ڿ� �и�
		for(int i=0;i<s.length;i++)
			System.out.println("�и��� ���ڿ�"+i+":"+s[i]); // �и��� ���ڿ�0: Java  �и��� ���ڿ�1: C++
		
		a=a.substring(5); // �ε��� 5���� ������ ���꽺���� ����
		System.out.println(a); //C++
		
		char c = a.charAt(2);//�ε��� 2�� ���� ���� c���� C++�� 3��°���� ��
 		System.out.println(c);  //+

	}

}
