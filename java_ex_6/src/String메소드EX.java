
public class String메소드EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= new String("C#");
		String b = new String(",C++");
		
		System.out.println(a+"의 길이는 "+a.length()); //문자열 길이  C#의 길이는3
		System.out.println(a.contains("#")); //문자열 포함관계  true
		
		a=a.concat(b);
		System.out.println(a);//문자열 연결   C#.C++
		
		a=a.trim();
		System.out.print(a);//문자열 앞 뒤의 공백제거 C#,C++
		
		a=a.replace("C#","Java");
		System.out.println(a); //문자열 대치 Java,C++
		
		String s[] = a.split(",");//문자열 분리
		for(int i=0;i<s.length;i++)
			System.out.println("분리된 문자열"+i+":"+s[i]); // 분리된 문자열0: Java  분리된 문자열1: C++
		
		a=a.substring(5); // 인덱스 5부터 끝까지 서브스츠링 리턴
		System.out.println(a); //C++
		
		char c = a.charAt(2);//인덱스 2의 문자 리턴 c에는 C++의 3번째것이 들어감
 		System.out.println(c);  //+

	}

}
