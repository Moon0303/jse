package oop02.inhebitance;

public abstract class AbsDemo {
	public static void main(String[] args) {
		Sum01 sum01 = new Sum01();
		System.out.println(sum01.sum(10, 20));
		System.out.println(sum01.toString());
		
		
		
		Sum02 sum02 = new Sum02();
		System.out.println(sum02.sum(10, 20));
		System.out.println(sum02.toString());;
		
	}
}

abstract class Abssum{
	// 필수적으로 강제성이 있는 메소드
	public abstract String toString();
	public String sum (int i , int k){
		int sum = i + k;
		return ""+sum; //int 리턴을 String 반환 값으로 주는 방법
	}
}

class  Sum01 extends Abssum{

	@Override
	public String toString() {

		return "class  Sum01 extends Abssum";
	}
	
}

class Sum02 extends Abssum {

	@Override
	public String toString() {
		
		return "class  Sum02 extends Abssum";
	}
	
}
