package j17_JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Gson3 {
	
	public static void main(String[] args) {
	
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("username", "seokmin");
		jsonObject.addProperty("password", "1234");
		
		System.out.println(jsonObject);
		// 따로 toJson 을 하지 않아도 json 형태로 출력된다
		
		JsonArray jsonArray = new JsonArray();
		// 업캐스팅 상태 (Element형태로)
		jsonArray.add("java");
		jsonArray.add("python");
		jsonArray.add("javascript");
		jsonArray.add("c#");
		
		System.out.println(jsonArray);
		
		jsonObject.add("subject", jsonArray);
		
		System.out.println(jsonObject);
	}
}
