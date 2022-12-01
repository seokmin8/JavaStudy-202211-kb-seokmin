package j17_JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
//		Gson gsonBuilder = new GsonBuilder().create();
		// 위와 같은 형태를 아래처럼 풀어서 사용할 수 있다
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson2 = gsonBuilder.setPrettyPrinting().create();
		// .create() << 빌더 패턴
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "석민");
		map.put("email", "meddo@naver.com");
		map.put("address", "부산 북구");
		map.put("phone", "6688-8778");
		
		List<String> hobby = new ArrayList<>();
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		
		map.put("hobby", hobby);
		// Map을 => json 형태로 변경!
		
		System.out.println(map);
		
		String json = gson.toJson(map);
		String json2 = gson2.toJson(map);
		// 문자열로 변경
		
		System.out.println(json);
		System.out.println("----1----");
		System.out.println(json2);
		System.out.println("----2----");
		
		Map<String, Object> jsonMap = gson2.fromJson(json, Map.class);
		// json 을 Map으로 ~!
		System.out.println(jsonMap);
	}
	 
}
