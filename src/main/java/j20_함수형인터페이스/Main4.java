package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main4 {

	public static void main(String[] args) {
		
		Function<Integer, String> fx1 = age -> age + "살";
			// <파라메터, 리턴>
			System.out.println(fx1.apply(20));
		// 매개변수1개, 리턴1개 경우??
			Function<Function<Integer, String>, String> fx2 = fx -> fx.apply(22) + "입니다";

			System.out.println(fx2.apply(age -> age + "살"));
			
			System.out.println();
			
			BiFunction<Integer, String, Map<Integer, String>> createMap = (number, name) -> {
				// 리턴이 맵일때			리턴때 여기 값					int	  string
				Map<Integer, String> map = new HashMap<>();
				map.put(number, name);
				return map;
			};
			
			List<Map<Integer, String>> list = new ArrayList<>();
			list.add(createMap.apply(100, "김준일"));
			list.add(createMap.apply(200, "유열림"));
			list.add(createMap.apply(300, "이승아"));
			list.add(createMap.apply(400, "이영인"));
			list.add(createMap.apply(500, "임지현"));
			
			System.out.println(list);

	}

}
