
public class thisUseBook {
	String title;
	String author;
	void show() {
		System.out.println(title+" "+author);
	}
	public thisUseBook() {
		this("","");
		System.out.println("������ȣ���");
	}
	public thisUseBook(String title) {
		this(title,"���ڹ̻�");
	}
	public thisUseBook(String title,String author) {
		this.title=title;
		this.author=author;
	}

	public static void main(String[] args) {
		thisUseBook littleprince=new thisUseBook("�����","�����㺣��");
		thisUseBook lovestory=new thisUseBook("������");
		thisUseBook emptyBook=new thisUseBook();
		lovestory.show();
	}

}
