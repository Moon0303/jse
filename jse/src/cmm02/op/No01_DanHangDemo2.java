package cmm02.op;

public class No01_DanHangDemo2 {
	
	public static void main(String[] args) {
		
		int i = 5;
		int j = 0;
		
		j = i++; //출력후 연산
		
		System.out.println("i의 값:"+i+"\n j= i++의 값:"+j);
		
		
		int x = 5;
		int y = 0;
		
		y= ++x; // 연산후 출력
		
		System.out.println("\nx의 값:"+x+"\n y= ++x의 값:"+y);
		
	}
	
}
