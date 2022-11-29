package j16_컬렉션.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringMap {

	public static void main(String[] args) {
		
		Map<String, String> language = new HashMap<String, String>();
		// map은 add가 없고 put이 존재
		// 데이터타입과 밸류값
		// 키 값이 있기 때문에 get 가능!
		// set과 같이 순서는 없다!
		// 밸류를 출력하고, 밸류값은 중복 가능하다
		// 키값은 중복을 허용하지 않는다!!
		
		language.put("java", "자바2");
		language.put("html", "에이치티엠엘");
		language.put("css", "씨에스에스");
		language.put("js", "자바스크립트");
		language.put("python", "파이썬1");
		language.put("python2", "파이썬2");
		// 키값이 중복되었을 때 실행은 되지만 앞의 벨류값은 뒤의 값에 덮혀진다 (없어짐)
		
		System.out.println(language);

		String s = language.get("python");
		// List에서 인덱스 선택과 같음
		System.out.println(s);
		
		language.replace("java", "자바");
		// 해당키의 벨류를 해당벨류로 바꾸겠다
		
		language.replace("java", "자바2", "자바3");
		// (키, 올드, 뉴) 올드 벨류값도 일치해야한다
		// 불일치 시 수정안됨~!
		
		System.out.println(language.get("java"));
		
		language.remove("python2");
		// 해당 키값의 데이터와 함께 삭제함
		
		System.out.println(language);
		System.out.println("===============");
		
		// map ~ forEach 문!
		language.forEach((k,v) -> {
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
		System.out.println("===============");
		
		for(Entry<String, String> entry : language.entrySet()) {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		}
		System.out.println();
		
		Iterator<String> ir = language.keySet().iterator();
		
		while(ir.hasNext()) {
			 String key = ir.next();
			 System.out.println(key);
			 System.out.println(language.get(key));
		}
	
	}

}
