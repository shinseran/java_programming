
public class 정수가아닌문자열을정수로변환예외처리 {

	public static void main(String[] args) {
		String[] stringNumber= {"23","12","3.141592","998"};
		int i=0;
		try {
			for(i=0;i<stringNumber.length;i++) {
				int j=Integer.parseInt(stringNumber[i]);//문자열 정수로 변환
				System.out.println("숫자로 변환된 값은"+i);
			}
			
		}
		catch(NumberFormatException e) {
			System.out.println(stringNumber[i]+"는 정수로 변환할 수 없습니다.");
		}

	}

}
