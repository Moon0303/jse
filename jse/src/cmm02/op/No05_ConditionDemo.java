package cmm02.op;

import java.util.Scanner;

public class No05_ConditionDemo {
	public static void main(String[] args) {
		int val01 = 0;
		int val02 = 0;
		Scanner scanner = new Scanner(System.in);
		val01 = scanner.nextInt();
		
		System.out.println("입력 값은 "+val01+"입니다");
		
		if ((val01 == 1) && (val02 == 2)){
			System.out.println("val01 = 1  ,  val02 = 2 이다");
		}
		
		if((val01 == 1)||(val02 == 1)){
			System.out.println("val01 이 1 이거나 , val02 가 1일때");
		}
		
	

		
		
	}

}
