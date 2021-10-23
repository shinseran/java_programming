import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle() {
		
	}
	public int getArea() {
		return width*height;
	}

	public static void main(String[] args) {
		Rectangle rect;
		rect = new Rectangle();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">>>");
		
		rect.width=scanner.nextInt();
		rect.height=scanner.nextInt();
		
		System.out.println("사각형의 넓이는"+rect.getArea());
		
		scanner.close();
		

	}

}
