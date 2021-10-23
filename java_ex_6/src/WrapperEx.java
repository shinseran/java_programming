
public class WrapperEx {

	public static void main(String[] args) {
		
			System.out.println(Character.toLowerCase('A'));//A를 소문자로 변환
			char c1='4' , c2='F';
			if(Character.isDigit(c1))//문자 c1이 숫자이면 true
			 System.out.println(c1+"는 숫자");                              //4는 숫자
			 if(Character.isAlphabetic(c2))//문자 c2가 영문자이면 true;
				 System.out.println(c2+"는 영문자");                          //F는 영문자
			 
			 System.out.println(Integer.parseInt("-123"));//-123을 10진수로 변환     -123
			 System.out.println(Integer.toHexString(28));//28을 2진수 문자열로 변환         1c
			 System.out.println(Integer.toBinaryString(28));//28을 16진수 문자열로 변환       11100
			 System.out.println(Integer.bitCount(28));//28에 대한 2진수의 1의 개수          3
			 
			 Double d = Double.valueOf(3.14);
			 System.out.println(d.toString());//더블을 문자열 3.14로 변환             3.14
			 System.out.println(Double.parseDouble("3.14"));//문자열을 실수 3.14로 변환           3.14
			 
			 boolean b=(4>3);//b는 true
			 System.out.println(Boolean.toString(b));//true를 문자열 true로 변환         true
			 System.out.println(Boolean.parseBoolean("false"));//문자열을 false로 변환   false
				 
				
		

	}

}
