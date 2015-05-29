package api02.util.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KeySetDemo {
		public static void main(String[] args) {
			Map map = new HashMap();
			//
			map.put("김연아", new Integer(98));
			map.put("아사다 마오", new Integer(60));
			map.put("소트니", new Integer(30));
			
			Set set = map.entrySet();
			Iterator it = set.iterator();
			
			while (it.hasNext()){
				//it.next()를 코딩하면 에러다 발생하는데
				//Entry로 캐스팅하면된다
				Map.Entry e = (Entry) it.next();
				System.out.println("참가자 : " + e.getKey()
									+", 점수 : " +e.getValue());
			}
		}
}
