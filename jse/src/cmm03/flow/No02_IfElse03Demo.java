package cmm03.flow;

import java.util.Scanner;

		/*Date : 5월 13일
		내용 : 입력을 받아 출력하는 성적표*/

public class No02_IfElse03Demo {
	public static void main(String[] args) {
			// 지역변수 선언시 디폴트 값을 준다!!(C 언어 = NULL)
			int kor = 0 , eng = 0 , sum  = 0 , math = 0;
			double avg = 0.0;
			String msg ;  // 문자열 입력 변수 정의
			
			Scanner scanner = new Scanner(System.in); // 스캐너 ,변수명 =  스캐너 안에 입력시스템  (입력 전 가장 위에 올림)   
			
			
			System.out.println("국어점수 입력 :");
			kor = scanner.nextInt();                            
			System.out.println("영어점수 입력 :");   
			eng = scanner.nextInt();                    //eng에 입력값을 넣음
			System.out.println("수학점수 입력 :");
			math = scanner.nextInt();
			
			
			
			sum = kor + eng + math;
			avg = sum/3;
			//avg = Math.floor(sum/3) = 버림함수   
			
			if (avg == 100){
				msg = "보너스 지급!!";
			}
			else if (avg > 70){
				msg = "시험 합격입니다";   
			}
			else{
				msg = "재시험입니다 ";
			}
			
			System.out.println("국어 = "+ kor + "\t 영어 = "+eng+"\t 수학 ="+math);
			System.out.println("합계 : " + sum);
			System.out.println("평균 = "+(int)avg);
			System.out.println("귀하의 시험 결과  : "+msg);
			
		
			
	}

}