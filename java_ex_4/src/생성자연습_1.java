
public class �����ڿ���_1 {
	String title;
	String author;
	
	public �����ڿ���_1(String t) {
		title = t;
		author="���ڹ̻�";
	}
	public �����ڿ���_1(String t,String a) {
		title=t; author=a;
	}

	public static void main(String[] args) {
		�����ڿ���_1 littlePrince = new �����ڿ���_1("�����","�����㺣��");
		
		�����ڿ���_1 lovestory = new �����ڿ���_1("������");
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(lovestory.title+" "+lovestory.author);
		

	}

}
