import java.util.Scanner; 
public class Grade { 
	private int math, science, english; 
	public Grade(int math, int science, int english) { 
		this.math = math; 
		this.science = science;
		this.english = english; 
		}
	public int getMath() {
		return math; 
		} 
	public void setMath(int math) { 
		this.math = math; 
		} 
	public int getScience() { 
		return science; 
		}
	public void setScience(int science) {
		this.science = science; 
		}
	public int getEnglish() {
		return english; 
		} 
	public void setEnglish(int english) {
		this.english = english; 
		} 
	public int average() { 
		return (math + science + english) / 3; 
		}
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); 
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>"); 
		int math = scanner.nextInt(); 
		int science = scanner.nextInt(); 
		int english = scanner.nextInt(); 
		Grade me = new Grade(math, science, english); 
		System.out.println("����� " + me.average());
     scanner.close();
     } 
	}

