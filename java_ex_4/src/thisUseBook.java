
public class thisUseBook {
	String title;
	String author;
	void show() {
		System.out.println(title+" "+author);
	}
	public thisUseBook() {
		this("","");
		System.out.println("생성자호출됨");
	}
	public thisUseBook(String title) {
		this(title,"작자미상");
	}
	public thisUseBook(String title,String author) {
		this.title=title;
		this.author=author;
	}

	public static void main(String[] args) {
		thisUseBook littleprince=new thisUseBook("어린왕자","생택쥐베리");
		thisUseBook lovestory=new thisUseBook("춘향전");
		thisUseBook emptyBook=new thisUseBook();
		lovestory.show();
	}

}
