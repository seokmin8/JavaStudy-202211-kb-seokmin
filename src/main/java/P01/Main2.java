package P01;

import java.util.LinkedHashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main2 {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Object> map1 = new LinkedHashMap<String, Object>();
		
		Gson gson = new Gson();
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		gson = gsonBuilder.setPrettyPrinting().create();
			
		map1.put("companyId", 100);
		map1.put("companyName", "Apple");
		map1.put("address", "Apple Computer Inc. 1 infinite Loop");
		map1.put("city", "Cupertino");
		map1.put("state", "CA");
		map1.put("zipCode", "95014");
		
		String json = gson.toJson(map1);
		
		System.out.println(json);
	}
}
