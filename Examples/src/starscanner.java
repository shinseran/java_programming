import java.util.Scanner;
public class starscanner {

	public static void main(String[] args) {
		System.out.println("정수를 입력하시오>>"); 
		Scanner s=new Scanner(System.in); 
		int n=s.nextInt(); 
		for(int i=0; i<n; i++) { 
			for(int j=0; j<n-i; j++) { 
				System.out.print("*"); } 
			System.out.println(); } 
		s.close();

	

	}

}
//반대로 그리기
/*
 public class h0303 { public static void main(String[] args) 
 { System.out.print("정수를 입력하시오>>"); 
 Scanner s=new Scanner(System.in); 
 int n=s.nextInt(); for(int i=0; i<n; i++) { 
 for(int j=0; j<=i; j++) { 
 System.out.print('*'); } S
 ystem.out.println(); } 
 s.close(); } }


 */
