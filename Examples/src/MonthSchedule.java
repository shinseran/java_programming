
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
		System.out.print("날짜(1~30)?");
		int i = sc.nextInt(); 
		System.out.print("할일(빈칸없이입력)?"); 
		String work = sc.next();
		day[i] = new Day(work); 
		System.out.println();
		}
	public void view() {
		System.out.print("날짜(1~30)?");
		int date = sc.nextInt();
		System.out.print(date + "일의 " + "할 일은 " + day[date]); 
		}
	public void finish() {
		System.out.println("프로그램을 종료합니다."); 
		}
	public void run() { 
		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)" + " >>");
			int sel = sc.nextInt();
			if (sel == 1) {
				input();
			} else if (sel == 2) { 
					view(); 
			} else if (sel == 3) {
				finish(); 
				break; 
			} else { 
				System.out.println("1, 2, 3중에 입력하세요.");
				}
			}
		}
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); 
		System.out.println("이번달 스케쥴 관리 프로그램.");
		april.run(); 
		}
	}

