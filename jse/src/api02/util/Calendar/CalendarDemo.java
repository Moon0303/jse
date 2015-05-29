package api02.util.Calendar;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		
		//Calendar 의 getInstance()는 스태틱이라
		//클래스를 통해 바로 불러와서 인스턴스를 생성한다.
		//그래서 new Calendar() 와 같은
		//생성자 문법을 사용하지 않고 아래처럼 생성했다.
		Calendar date = Calendar.getInstance();
				System.out.print("오늘 날짜 : ");
				System.out.print(date.get(Calendar.YEAR)+ "년");
				System.out.print(date.get(Calendar.MONTH+1)+ "월");
				System.out.print(date.get(Calendar.DATE)+ "일");
				
				//위 결과를 그대로 출력하면 오늘날짜 : 2015년 4월 29일 이라고 나옴.
				//자바 API 튜토리얼을 보면 "calendars is JANUARY witch is 0"이라고 나와있다
				//따라서 월은 0부터 시작하므로 위 식에서 1을 더해서 출력해야한다
				// (date.get()Calendar.MONYH)+1) 괄호위치에 주의!!
				// 
				System.out.println();
				System.out.print("현재 시각 : ");
				System.out.print(date.get(Calendar.HOUR)+ "시");
				System.out.print(date.get(Calendar.MINUTE)+ "분");
				System.out.print(date.get(Calendar.SECOND)+ "초");

				//프로그램 트라이얼 보면 30일 사용제한 같은 것이 걸린 것을 본 케이스라면.
				//30일후의 시간을 자동으로 반환으로 반환하는 로직도 필요하다.
				// 아래와 같이 처리한다.
				
				System.out.println("현재 기준의 임의의 시간을 설정할 때");
				System.out.println("30일 후의 날짜를 열고자 할때");
				date.add(Calendar.DATE, 30);
				System.out.println(toString(date));
				System.out.println("7시간전 날짜를 얻고자 할때");
				date.add(Calendar.HOUR, -7); //파라미터에 마이너스 대신 값을 주어서 처리하면됨
				System.out.println(toString(date) ); // 스태틱이라 객체생성없이 바로 가져다 함
				
				
				// 스케줄 프로그램 작성할때 특정일자를 픽스해야하는 경우에는 다음과 같이처리
				// 만약 22시 30분 45초에 알람을 울리세 하는 기능을 주고자 할때
				
				date.set(Calendar.HOUR, 22);
				date.set(Calendar.MINUTE, 30);
				date.set(Calendar.SECOND, 45);
				System.out.println("수정된 시간은 : ");
				System.out.print(date.get(Calendar.HOUR)+ "시");
				System.out.print(date.get(Calendar.MINUTE)+ "분");
				System.out.print(date.get(Calendar.SECOND)+ "초");
					
				
				//	바로 출력을 하면 시스템에서 제공하는 시간들이 나옵니다
				// 따라서 ToString() 를 오버라이딩 해야한다
				// 이기서 static으로 별도로 작성합니다
	}
			public static String toString(Calendar date) {
				
				return		date.get(Calendar.YEAR) + "년"
							+date.get(Calendar.MONTH) + "월"
							+date.get(Calendar.DATE) + "일";
						   
			}
	
}
