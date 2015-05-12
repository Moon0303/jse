package cmm01.var;
/*
 Date : 2015.05.11
 Author : �繮��
 Description : ĳ���� ���� ���� �н� �ڷ� 
 * */
class No02_CastingDemo{ 
	
public static void main(String[] args) {
/*
 Up-Casting
 ��ȯ (Conversion)
 =Promotion
 =������ (Implict)�ڵ���ȯ
 �ڵ� ��ȯ�� ������ Ÿ���� ǥ�������� �����ʿ���
 ���������� ��ȯ�� �ɶ��� �����ϴ�.
 
  byte - > short -> int -> long -> float -> double
  char -> int
 * */	
		byte varByte = 1;
		int varInt = 123;
		double varDouble = 123.456;
		
		int upByte = varByte;
		double upByte2 = varByte;
		double upInt = varInt;
	
	

		
		
	System.out.println("Hello Java!");
	
	
	/*
	 Down-Casting
	 =ĳ����(Casting)
	 =������ȯ
	 ���α׷����� �����(explict)���� �����ϴ� Ÿ�Ժ�ȯ
	 ��Һ�ȯ�� �Ǵ� ��쿡�� �ݵ�� ��������� ĳ�����Ͽ��� �Ѵ�
	 �� , ������ �ս��� �߻��� �� �ִ�. 
	 * */

		double varDou = 123.456;
		int varInt2 = 3;
//		int downByte = (int)varDou;
		byte varB2 = (byte) varInt2;
		float varf = 123.456f;
		int varInt3 = (int) varf;

	    

	System.out.println("varInt3 �� : " + varInt3);
	
	
	
	}



}




