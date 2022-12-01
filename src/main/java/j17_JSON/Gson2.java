package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
		
		User user = User.builder()
				.username("seokmin")
				.password("1234")
				.name("석민")
//				.email("meddo@naver.com")
				.build();
		
		System.out.println(user);
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls() 	// null을 표현하고 싶을 때
				.excludeFieldsWithoutExposeAnnotation()	// 모든 데이터가 보이지 않는다
				.create();
		
		String userJson = gson.toJson(user);
		// user객체를 json형태로
		 
		System.out.println(userJson);
		
		System.out.println("--------1--------");
		
		User userObj = null;
		// 초기화를 따로 하지 않아도 된다
		
		userObj = gson.fromJson(userJson, User.class);
		System.out.println(userObj);
		// obj형태로 출력
		
		System.out.println("--------2--------");
		
		
	}
}
