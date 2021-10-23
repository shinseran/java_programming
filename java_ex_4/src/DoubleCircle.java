
public class DoubleCircle {
	int radius;
	String name;
	
	public DoubleCircle() {
		radius=1; name="";
		
	}
	public DoubleCircle(int r,String n) {
		radius=r; name=n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		DoubleCircle pizza=new DoubleCircle(10,"자바피자");
		
		double area = pizza.getArea();
		
		System.out.println(pizza.name+"의 면적은"+area);
		
		
		DoubleCircle donut = new DoubleCircle();
		
		donut.name="자바도넛";
		area = donut.getArea();
		
		System.out.println(donut.name+"의 면적은"+area);
		
		
		
		
		

	}

}
