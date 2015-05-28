package api01.lang.object;


/*
 java.lang.String 에서
 subString(n)은 n부터 끝까지 잘라낸다.
 subString(n,m)은 n부터 m까지 표시한다
 n <= x < m           (n이상 m 미만) 
 */
public class SubStringDemo {
	public static void main(String[] args) {
		String str = "Hello Java";
		System.out.println(str.substring(6));
		System.out.println(str.substring(6,8));
	}
}
