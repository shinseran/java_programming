
import java.util.Scanner; 
public class MonthSchedule {
	private int x; 
	Day[] day = null;
	Scanner sc = new Scanner(System.in); 
	public MonthSchedule(int x) { 
		this.x = x; 
		day = new Day[x];
		}
	public void input() {
		System.out.print("��¥(1~30)?");
		int i = sc.nextInt(); 
		System.out.print("����(��ĭ�����Է�)?"); 
		String work = sc.next();
		day[i] = new Day(work); 
		System.out.println();
		}
	public void view() {
		System.out.print("��¥(1~30)?");
		int date = sc.nextInt();
		System.out.print(date + "���� " + "�� ���� " + day[date]); 
		}
	public void finish() {
		System.out.println("���α׷��� �����մϴ�."); 
		}
	public void run() { 
		while (true) {
			System.out.print("����(�Է�:1, ����:2, ������:3)" + " >>");
			int sel = sc.nextInt();
			if (sel == 1) {
				input();
			} else if (sel == 2) { 
					view(); 
			} else if (sel == 3) {
				finish(); 
				break; 
			} else { 
				System.out.println("1, 2, 3�߿� �Է��ϼ���.");
				}
			}
		}
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); 
		System.out.println("�̹��� ������ ���� ���α׷�.");
		april.run(); 
		}
	}

