package api02.util.arrays;

import java.util.Vector;

/*
  java.util.Arrays 의 메소드인
  sort()는 오름차순 정렬에 특화되어있음
 */

public class SortDemo {
		public static void main(String[] args) {
			
		}
}


class ArratsDemo{
	//Integer 는 int 형의 Warper Class입니다.
	//즉 기본형인 int를 객체화 시킨것이다
	//벡터는 기본형을 담을 수 없기 때문에 int형을
	//담을 경우가 생기면 이처럼 wraper class를 사용합니다
	
		Vector<Integer> vec = new Vector<Integer>();

	
		public Vector<Integer> getAscSort(int[] arr){
			
			/*
			 * 아래 로직은 오름차순 정렬 알고리즘인 스왑알고리즘이다
			 * 바깥쪽 for문의 limit 이 arr.length-1인 것에 주의
			 */
			for (int i = 0; i< arr.length-1;i++){
				for(int j = 0 ; j<arr.length;j++){
					if(arr[j]> arr[j+1]){
						int temp;
						temp = arr[j+1];
						arr[j+1] = temp;
					}
					}
				}
			}
		}
asdk;jsadjlk
		

