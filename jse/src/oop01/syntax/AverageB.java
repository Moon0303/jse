package oop01.syntax;

public class AverageB {
	//필드 값 선언
	String name;
	int kor;						// 필드영역 (c언어의 전처리 같은곳 ) (ex. 구조체선언)
	int eng;
	int tot;
	double avg;
	
	//이름 저장 기능(함수화)
	
	public void setName(String name){
		this.name = name;							//☆this (사용하면 인스턴스변수를 불러올수있음, 사용하지않으면 지역변수로 선언됨)
		name = "으아아";
	
	}
	
	
	public static void main(String[] args) {
		//학생 객체생성 및 메모리 할당
				AverageA hulk = new AverageA();
				AverageA iron = new AverageA();
				AverageA hawk = new AverageA();
				
				// 이름 저장
				hulk.name = "헐크";
				iron.name = "아이언";
				hawk.name = "호크";
				
				//점수 저장
				hulk.kor = 100;
				hulk.eng = 80;
				iron.kor = 50;
				iron.eng = 90;
				hawk.kor = 20;
				hawk.eng = 40;
				
				//총점과 평균을 계산하는 기능
				hulk.tot = hulk.kor + hulk.eng ;
				hulk.avg = hulk.tot/2;
				
				iron.tot = iron.kor + iron.eng ;
				iron.avg = iron.tot/2;
				
				hawk.tot = hawk.kor + hawk.eng ;
				hawk.avg = hawk.tot/2;
				
				System.out.println("==="+iron.name+"===");
				System.out.println("국어 : "+iron.kor);
				System.out.println("영어 : "+iron.eng);
				System.out.println("합계 : "+iron.tot);
				System.out.println("합계 : "+iron.avg);
				System.out.println();
				
				System.out.println("==="+hulk.name+"===");
				System.out.println("국어 : "+hulk.kor);
				System.out.println("영어 : "+hulk.eng);
				System.out.println("합계 : "+hulk.tot);
				System.out.println("합계 : "+hulk.avg);
				System.out.println();
				
				System.out.println("==="+hawk.name+"===");
				System.out.println("국어 : "+hawk.kor);
				System.out.println("영어 : "+hawk.eng);
				System.out.println("합계 : "+hawk.tot);
				System.out.println("합계 : "+hawk.avg);
				System.out.println();
				
		
	}
	

}
