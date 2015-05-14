package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman02 {
		public static void main(String[] args) {
			
			System.out.println("주민등록 번호 13자리를 입력하세요");
			Scanner scanner = new Scanner(System.in);
			String ssn = scanner.next();
			char ch = ssn.charAt(7);
			
			switch (ch) {
			case '1': case '3' : System.out.println("남자");  break;   		// case 다음 'a' <<
			case '2': case '4' : System.out.println("여자");  break;  		// 중복 케이스는 겹쳐서 표현가능 
			case '5': case '6' : System.out.println("외국인");  break;

			default: System.out.println("틀렷습니다 다시 입력하세요");
			break;
			}
			
		}
}
