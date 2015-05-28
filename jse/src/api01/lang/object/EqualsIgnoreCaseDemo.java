package api01.lang.object;

public class EqualsIgnoreCaseDemo {
		public static void main(String[] args) {
			System.out.println(
					"Hello".equals("hello") ? "같습니다" : "다릅니다"
					);
			
			
			//equalsIgnoreCase : 대소문자 구분 X
			System.out.println(
					"Hello".equalsIgnoreCase("hello") ? "같습니다" : "다릅니다"
					);
		}
}
