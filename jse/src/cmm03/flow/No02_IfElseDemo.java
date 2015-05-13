package cmm03.flow;

import java.util.Scanner;  // 입력선언

public class No02_IfElseDemo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //입력 객체지향
		
		System.out.println("값을 입력하세요..");
		
		int i = 0;
		
		i = scanner.nextInt(); 
		
		System.out.println("입력 값은 "+i+"입니다");
	}
}
