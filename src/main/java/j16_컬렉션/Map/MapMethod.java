package j16_컬렉션.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethod {

	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		// v값에 Object가 들어감으로 아무거나 다 들어갈 수 있다
		
		map.put("username", "seokmin");
		map.put("password", "1234");
		map.put("name", "석민");
		map.put("email", "mbc@naver.com");
		map.put("age", "3");
		map.put("gender", true);
		
		Map<String, String> address = new HashMap<>();
		// <key, value>
		// HashMap은 Hash값에 따라 순서가 정해진다 (작은값 ~ 큰값)
		
		address.put("address1", "부산광역시");
		address.put("address2", "북구");
		address.put("address3", "백양대로1050번길");
		
		map.put("address", address);
		
		Map<Integer, String> subject = new HashMap<>();
		subject.put(100, "java");
		subject.put(200, "C#");
		subject.put(300, "python9");
		subject.put(401, "python8");
		subject.put(405, "python7");
		subject.put(503, "python6");
		
		map.put("subject", subject);
		
		System.out.println(map);
		
		Map<Integer, String> subject1 = new TreeMap<>();
		subject1.put(100, "java");
		subject1.put(200, "C#");
		subject1.put(300, "python1");
		subject1.put(401, "python2");
		subject1.put(405, "python3");
		subject1.put(503, "python4");
		map.put("subject1", subject1);
		
		System.out.println(map);
		
		System.out.println("---- 1 ----");
		System.out.println(((Map<Integer, String>) map.get("subject1")).get(405));
		
		List<String> hobby = new ArrayList<>();
		
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");
		
		map.put("hobby", hobby);
		// hobby는 Object
		System.out.println("---- 2 ----");
		System.out.println(hobby.get(2));
		System.out.println("---- 3 ----");
		System.out.println(((List<String>) map.get("hobby")).get(2));
		
		Set<Entry<String, Object>> userEntry = map.entrySet();
		// map을 entry set형태로 바꿔라
		// 아래와 마찬가지의 형태
		List<Map<String, Object>> listMap = new ArrayList<>();
		System.out.println("---- 4 ----");
		for(Entry<String, Object> entry : userEntry) {
			System.out.println(entry);	// k, v 다 출력
		}
		System.out.println("---- 5 ----");
		System.out.println(map);
		System.out.println(userEntry);
		// map은 중괄호
		// set =>( userEntry )은 대괄호, set 원래는 하나의 값만 들어간다
		System.out.println("---- 6 ----");
		
		Set<String> names = new HashSet<>();
		
		names.add("1번");
		names.add("2번");
		names.add("3번");
		names.add("4번");
		names.add("5번");
		
		System.out.println(names);
		
		System.out.println("---- 7 ----");
		
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println("---- 8 ----");
		// 하나씩 출력하려면 foreach한다
		for(Entry<String, Object> entry : userEntry) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("---- 9 ----");
		
		Set<String> keys = map.keySet();
		// 키값만 Set(중복허용 안됨, 순서없음) 으로 변환하기
		
		for(String key : keys) {
			System.out.println(key);
			System.out.println(map.get(key));
			// map의 key값만 모아서 set으로 바꾼다! 
		}
		System.out.println("---- 10 ----");
		
		System.out.println(map.values());
		
		System.out.println("---- 11 ----");
		for(Object obj : map.values()) {	// collection 객체이고 value값만 뽑아낸것
			System.out.println(obj);
		}
		
		
	}
}
