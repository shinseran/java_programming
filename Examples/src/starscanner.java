import java.util.Scanner;
public class starscanner {

	public static void main(String[] args) {
		System.out.println("������ �Է��Ͻÿ�>>"); 
		Scanner s=new Scanner(System.in); 
		int n=s.nextInt(); 
		for(int i=0; i<n; i++) { 
			for(int j=0; j<n-i; j++) { 
				System.out.print("*"); } 
			System.out.println(); } 
		s.close();

	

	}

}
//�ݴ�� �׸���
/*
 public class h0303 { public static void main(String[] args) 
 { System.out.print("������ �Է��Ͻÿ�>>"); 
 Scanner s=new Scanner(System.in); 
 int n=s.nextInt(); for(int i=0; i<n; i++) { 
 for(int j=0; j<=i; j++) { 
 System.out.print('*'); } S
 ystem.out.println(); } 
 s.close(); } }


 */
