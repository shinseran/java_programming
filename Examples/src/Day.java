public class Day { 
	private String work;
	public Day(String work) {
		this.work = work; 
		} 
	public void set(String work) {
		this.work = work; 
		}
	public String get() {
		return work; 
		} public void show() {
			if (work == null) System.out.println("�����ϴ�.");
			else System.out.println(work + "�Դϴ�.");
			System.out.println(); 
			}
		}

