
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
		DoubleCircle pizza=new DoubleCircle(10,"�ڹ�����");
		
		double area = pizza.getArea();
		
		System.out.println(pizza.name+"�� ������"+area);
		
		
		DoubleCircle donut = new DoubleCircle();
		
		donut.name="�ڹٵ���";
		area = donut.getArea();
		
		System.out.println(donut.name+"�� ������"+area);
		
		
		
		
		

	}

}
