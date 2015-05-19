package oop01.syntax;

public class AverageC {
	
	//필드 값 선언
	String name;
	int kor;						// 필드영역 (c언어의 전처리 같은곳 ) (ex. 구조체선언)
	int eng;
	int tot;
	double avg;
	
	//이름 저장 기능(함수화)
	
	public void setName(String foo){
		this.name = foo;							//☆this (사용하면 인스턴스변수를 불러올수있음, 사용하지않으면 지역변수로 선언됨)
		
	
	}
	
	//국어 점수를 저장하는기능
	public void setKor(int Kor){
		this.kor = kor;
	}
	
	
	// 영어점수를 저장하는 기능
	public void setEng(int eng){
		this.eng = eng;
	}
	
	
	//합계
	public void setTot(int kor , int eng){
		this.tot = kor + eng;  
	}
	
	
	
	
	/*평균 점수를 구하는 기능 1*/
	
	public void setAvg(int kor ,int eng ){
		this.avg = (kor + eng )/ 2;
	
		/*Overloading : 오버로딩 */
	}
	
	
	
	//평균 점수를 구하는 기능 2
	
	public void setAvg(int tot ){
		this.avg = tot / 2;
	
	}
	
}
