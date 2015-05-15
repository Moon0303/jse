package cmm04.array;

/*향상된 for문*/

public class No04_AdvForLoopDemo {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		System.out.println("향상된 For 문으로 출력한 예제");
		
		for(int i : intArr){  				 //i가 intArr 마지막이 될때까지
			System.out.println("\t" + i);
		}
	}
}
