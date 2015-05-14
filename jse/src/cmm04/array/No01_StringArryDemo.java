package cmm04.array;

public class No01_StringArryDemo {
		public static void main(String[] args) {				
			String[] juso = {"서울","종로","광화문"};  			//바로 배열의 크기를 선언할수있다.  string[] : 문자배열을 선언
																//현재상태 : 3개의 방을가진 배열
			
			
			for(int i = 0 ; i<juso.length ; i++){  				// 조건문에 변수의 이름을 넣을수있다 변수명.랭쓰(길이)
				
				System.out.println(juso[i]);
			}
			
			
			
		}
}
