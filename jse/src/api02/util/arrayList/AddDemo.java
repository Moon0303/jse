package api02.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

 /*
  * java.util.ArrayList의 메소드인
  * add()는 벡터의 add() 와 동일하다.
  */

public class AddDemo {
		public static void main(String[] args) {
			/*
			 * Vector는 내부적으로 String 사용 . 속도가 느림. 동기화 지원
			 * ArratList 는 내부적으로 StringBuffer 사용 . 동기화 지원하지않음
			 */
			ArrayList<String> lists = new ArrayList<String>();
			
			// 항목 추가
			
			lists.add("서울");
			lists.add("부산");
			lists.add("대구");
			
			/*출력 1 : iterator() 이름*/
			//이클립스 제안 중에서 java.util.Iterator 선택
			Iterator <String> it1 = lists.iterator();
			
			//Itterator 를 선언하고 whi를 코딩하면
			//3가지 이클립스 제안이 나오는데 그중 ..with iterator를 선택
			
			while (it1.hasNext()) {
				//String string = (//String) it1.next();
				System.out.printf("%s",it1.next());
				//윗 구문 중 printf 인 것에 주의!!
				//printf 는 포맷팅한 결과를 콘솔에 출력하겠다는 의미
				//%s 는 String 값을 의미하며, 다음 구문인
				//it1.next() 의 리턴값을 보여주는 역할을 한다.
				//여기서 %s 의 s는 String을 의미
				//만약 숫자를 포맷팅한다면 %d 이며 이때 d는 decimal이라
				//하여 10진수를 뜻한다
			}
		
			System.out.println();
			/*
			 * 출력 2 : listIterator() 이용
			 */
			ListIterator<String> it2 = lists.listIterator();
			while(it2.hasNext()){
				System.out.printf("%s",it2.next());
			}
			System.out.println();
			
			
			//출력3 : previous() 이용
			
			while (it2.hasNext()){
				System.out.printf("%s",it2.previous());
			}
			
			//전체 요소를 한 번에 입력
			List<String> lists2 = new ArrayList<String>();
			lists.addAll(lists);  // 서울 , 부산 대구를 옮겨 담았다
			
			/*
			 * 출력4 . 확장 for 문 사용
			 * 윗 쪽의 출력문 보다 훨씬 간단해진 코드를 볼수 있음
			 * 
			 * 
			 */
			
			for (String s : lists2) {
				System.out.println();
			}
		
			
			
			
			/*출력 5 : 검색해서 출력
			 */
			
			Iterator<String> it3 = lists2.iterator();
			String str;
			while(it3.hasNext()){
				str = it3.next();
				
				/*
				 * ArrayList 의 요소중에서 "대" 자로
				 * 시작하는 것이 있다면 ...
				 */
			
			
				if(str.startsWith("대")){
					System.out.printf("%s",str);
				}
			
			
			
			}
			
			System.out.println();
			
			//arraylist는 동일한 자료의 입력이가능하다
			lists2.add("대전");
			lists2.add("대전");
			lists2.add("서울");
			
			Iterator<String> it4 = lists2.iterator();
			System.out.printf("%s",it4.next());
		
			System.out.println();
		}
		
		
}
