package cmm02.op;

public class No03_3HangDemo {
	public static void main(String[] args) {
		
		
		int left = 100;
		int right = 50;
		int result = 0;
		boolean boo = false; //  true or false 참과 거짓
		
		result = boo ? left : right ; //boolean 값에 참을넣으면 ':' 기준으로  왼쪽이 출력 거짓이면 오른쪽이 출력
		
		System.out.println("참 인가 거짓 인가 1이면 참 0이면 거짓 : " + result);
		
		
	}
}
