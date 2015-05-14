package cmm04.array;

public class Arry {
 public static void main(String[] args) {
	
		int[] intArr ;                              	 // [] : 배열
		intArr = new int[10];                      //new : 새메모리 할당
		
		
/*		for (int i = 0 ; i < 10 ; i++)
		{
			
			intArr[i] = (i+1) * 100;
			System.out.println(intArr[i]);
		}
		*/
		
		
		
		
		int i = 0;
		while(i < 10){
			
			intArr[i] = (i+1) * 100;
			System.out.println(intArr[i]);
			i++;
		}
		
		
		
}
}
