package oop02.inhebitance;

import java.security.acl.Acl;

class Aclass{
	void Over(int i){
		System.out.println("Aclass-Over메소드를 실행한 결과 :" + i*10);
	}
	void noOver (int i){
		System.out.println("Aclass-noOver메소드를 실행한 결과 :" + i* 10);
	}
}

class Bclass extends Aclass{
	void Over(int i){
		System.out.println("Bclass-Over메소드를 실행한 결과 :" + i*500);
	}
	void noOver(String s){
		System.out.println("Bclass-noOver메소드를 실행한 결과 :" + s);
	}
	void onlyB(){
		System.out.println("Bclass-noOver메소드를 실행한 결과 ");
	}
}
public class ObjectCastingDemo {
    //일반적인 객체생성
	
	
	public static void main(String[] args) {
		Aclass a = new Aclass();
		Bclass b = new Bclass();
		
		
		//부모타입 객체 = new 자식타입 ();
		//상속타입
		Aclass a2 = new Bclass();
		
		// 오버 라이딩시  자식 클래스의 메소드를 우선 호출
		a2.Over(3);
		//오버 라이딩을 하지 않으면 부모 메소드를 우선 호출
		a2.noOver(6);
		// 부모 클래스 타입을 자식클래스로 강제 형변환
		Bclass b2 = (Bclass)a2;
		
		b2.Over(1);
		b2.noOver("BBB");
		b2.onlyB();
    	
	}
}
