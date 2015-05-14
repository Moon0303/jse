package cmm03.flow;

import java.util.Scanner;



public class No07_ManOrWoman {
	public static void main(String[] args) {
		
		System.out.println("주민등록번호를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String ssn = scanner.next();
		
		
		
		char ch = ssn.charAt(7); 							//(7)번째 자릿수 확인
		
		if(ch == '1'|| ch == '3'){
		System.out.println("남자");
		}

		else if (ch == '2' || ch == '4'){
			System.out.println("여자");
		}
		
		else if (ch == '5'||ch == 6){
			System.out.println("외국인");
		}
		
		else{
			System.out.println("틀렷습니다 다시 입력하세요");
		}
		
	}

}
