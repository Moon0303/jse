package api01.lang.object;
/*
 java.lang.String 에 있는 메소드 중
 toUpperCase() : 대문자로 바꾸기
 trim() 	   : 공백을 모두 제거
 valueOf()	   : 다른타입을 모두 문자열로 리턴
 */

public class ValueOfDemo {
    public static void main(String[] args) {
		String str = "     Hello Java    ";
		String result = "";
		result = str.toUpperCase();
		//toUpperCase() : 대문자로 바꾸기
		System.out.println("toUpperCase()의 결과 : " +result);
		//DB에 따라 대소문자를 구분하는 DB가 있는데
		//이럴 경우 대소문자를 구분하지 않고 자바단에서 DB단으로
		//DB에 값을 던지는 경우 심각한 에러를 발생시킨다
		//그때 사용하는 메소드이다.
		result = str.toLowerCase();
		System.out.println("toLowerCase()의 결과 : " +result);
		
		
		result = str.trim();
		System.out.println("trim()의 결과 : " +result);
		
		
		int num;
		num = str.trim().indexOf("J");
		System.out.println("trim()을 사용한경우" + num);
		num = str.indexOf("J");
		System.out.println("trim()을 사용하지 않은 경우 " + num);

		
		/*
		 valueOf() 은 문자열로 리턴하기 때문에
		 Wrapper 클래스의 객체캐스팅의 열할을 수행한다.
		 */
		
		System.out.println("=======valueOf 메소드사용 =======");
		String str2 = "Hello Java";
		result = String.valueOf(str2.length());
		System.out.println(result);
    
    }
}
