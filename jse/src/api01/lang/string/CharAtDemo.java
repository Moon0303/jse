package api01.lang.string;
/*
 java.lang.String
 charAt() : 지정된 위치에 있는 문자를 리턴함. index 는 0 부터 시작
 indexOf() : 주어진 문자가 존재하는지 확인하여 위치를 알려줌. 없으면 -1 반환
 */
public class CharAtDemo {
	public static void main(String[] args) {
		String ssn = new String("800-1555555");
		/*
		 * ssn.indexOf("-")+1
		 * 주민등록번호상의 "-"(스네이트바) 의 위치를(index) 리턴하는데
		 * "-"다음 숫자를 리턴 하도록하기 위해 +1 을 준다.
		 */
		char isMan = ssn.charAt(ssn.indexOf("-") +1);
//		char isMan = ssn.charAt(7);
		/*
		 *char isMan = ssn.charAt(7);
		 *위와같이 표현해도 무관하다.
		 * index 위치값이 0 부터 시작한다는 점과
		 * parameter 숫자값이 index값을 의미한다는 점만
		 * 기억하면되. 
		 */
		switch (isMan) {
		/*
		 * switch(조건) 이 들어가며
		 * case 다음 값은 조건이 가지고 있는 value(값) 을 의미한다
		 * 예제로 보면 inMan 이 1이라면... 하면서 진행된다.
		 */
		case '1': case '3': System.out.println("남자");	break;
		case '2': case '4': System.out.println("여자");	break;
		default: System.out.println("??");				break;
		}
	}
}
