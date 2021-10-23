
public class 생성자연습_1 {
	String title;
	String author;
	
	public 생성자연습_1(String t) {
		title = t;
		author="작자미상";
	}
	public 생성자연습_1(String t,String a) {
		title=t; author=a;
	}

	public static void main(String[] args) {
		생성자연습_1 littlePrince = new 생성자연습_1("어린왕자","생택쥐베리");
		
		생성자연습_1 lovestory = new 생성자연습_1("춘향전");
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(lovestory.title+" "+lovestory.author);
		

	}

}
