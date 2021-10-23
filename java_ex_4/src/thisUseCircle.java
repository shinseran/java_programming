
public class thisUseCircle {
	int radius;
	public thisUseCircle(int radius) {
		this.radius=radius;
	}
	public void set(int radius) {
		this.radius=radius;
	}

	public static void main(String[] args) {
		thisUseCircle ob1 = new thisUseCircle(1);
		thisUseCircle ob2 = new thisUseCircle(2);
		thisUseCircle ob3 = new thisUseCircle(3);
		
		ob1.set(4);
		ob2.set(5);
		ob3.set(6);

	}

}
