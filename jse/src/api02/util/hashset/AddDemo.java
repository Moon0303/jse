package api02.util.hashset;

import java.util.HashSet;
import java.util.Objects;

/*
 * java.util.HashSet
 * - Set 인터페이스를 구현한 가장 대표적인 컬렉션
 * - 중복된 요소를 저장하지 않음
 * - 해상기법을 이용 해서구현됨
 * - 자주 사용되는 메소드
 * - boolean add(Object o)
 * - void clear() 	// 요소 모두 삭제
 * - object clone() // 복제하여 반환
 * - boolean contains(object o ) // 값이 존재하는 지검색
 * - int size() // 요소들의 갯수를 반환
 * 
 */

/*
 * java.util.HashSet 의 메소드인
 * add() 는 객체를 추가하느 ㄴ기능을 가짐 .
 * 객체를 추가할 때 HashSet이 이미 가지고 있는 객체라면
 * 중복으로 간주하고 저장하지 않는다.
 * 그리고 false를 리턴한다
 */

public class AddDemo {
		public static void main(String[] args) {
			Objects[] arr = {"1", new Integer(2),"2","2","2","2","2","3","3","4",};
			// 이클립스 제안중에서 java.util.set를 선택
			Set set = new HashSet();
		}
}
