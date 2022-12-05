package j21_문자열메소드;

import java.util.Arrays;
import java.util.List;

public class StringMethod4 {

	public static void main(String[] args) {
		
		// 만약 string 문자열에 띄어쓰기가 없을 때!?
		String roles = "ROLE_USER, ROLE_MANAGER,ROLE_ADMIN, GUEST";
		// 다른 문장에 들어있는 띄어쓰기를 다 없애주는 작업!
		roles = roles.replaceAll(" ", "");
		// 띄어쓰기를 다 여백없는걸로 바꿔라
		String[] roleArray = roles.split(",");
		List<String> roleList = Arrays.asList(roleArray);
		
		System.out.println(roleList);
		
		// forEach로 하나씩 값을 꺼내기
		roleList.forEach(role -> {
			// 만약 문자열에 Role이란 문장이 없을 때 , 다른문장 존재
			// ROLE_ 로 시작하는지?? => 
			// prefix(접두어) startsWith()
			// suffix (접미어) endWith()
			if(role.startsWith("ROLE_") && role.equalsIgnoreCase("role_user")) {
				// ignoreCase => 소대문자 구분없이 단순히 글자로만 비교해준다
				System.out.println("권한 : " + role);
			}	// guest가 출력되지 않는다
		});

	}

}
