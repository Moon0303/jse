package api01.lang.object;

/*
 title문자열 길이 체크
 
 java.lang.String 에서
 length() 메소드는 문자열의 길이를 반환 (리턴)한다.
 */

public class LengthDemo {
	public static void main(String[] args) {
		
		String str = "Hello Java World";
		int len = str.length();
		System.out.println("문자열의 길이 : " + len);
	}
}
