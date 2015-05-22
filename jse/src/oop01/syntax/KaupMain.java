package oop01.syntax;

import java.util.Scanner;

public class KaupMain {
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			double height = 0;
			double weight = 0;
			int idx = 0;
			
			System.out.print("키를 입력해주세요 : ");
			height = scanner.nextDouble();
			System.out.print("몸무게를 입력 해주세요 :");
			weight = scanner.nextDouble();
		
			
			KaupVo vo = new KaupVo(height,weight);
			vo.setIdx(idx);
			
			
		/*	vo.setHeight(height);
			vo.setWeight(weight);*/
			
		/*	vo.getMsg();
			*/
			
			System.out.println(vo.toString());
			System.out.println("완료");
	
			
		}
}
