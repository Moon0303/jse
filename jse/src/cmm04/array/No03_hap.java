package cmm04.array;

public class No03_hap {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0 ;
		for (int i = 0 ; i< arr.length; i++){   //렝쓰 = 배열의 길이 
			sum += arr[i];
		}
		System.out.println("배열 원소의 합은 : "+sum);
		
	}
}
