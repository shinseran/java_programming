class Shape3{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}
public class SuperOverriding extends Shape3 {
	
	protected String name;
	
	public void draw() {
		name="Circle";
		super.name="Shape";
		super.draw();
		System.out.println(name);
	}

	public static void main(String[] args) {
		Shape3 b= new Shape3();
		b.paint();

	}

}
