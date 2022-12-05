package j21_문자열메소드;

import java.util.function.Function;

public class StringMethod3 {

	public static void main(String[] args) {
		
		Function<String, String> replacePhoneToken = phoneNumber -> phoneNumber.replaceAll("/", "")
				.replaceAll(" ", "")
				.replaceAll("-", "")
				.replaceAll("[.]", "");
		// . 을 표현할 때 그냥 쓰면 안되고 대괄호로 표현
		
		String phone = "010-6688/8778";
		String phone1 = "010-6688/8778";
		String phone2 = "010-6688/8778";
		String phone3 = "010-6688/8778";
		
		System.out.println(replacePhoneToken.apply(phone));
		
		System.out.println("-----1-----");
		
//		System.out.println(phone.replaceAll("-", ""));
		
		phone = phone.replaceAll("-", "");
		
		phone = phone.replaceAll("/", "");
		
		// phone에서 - 를 찾아서 ""(아무것도 없음) 으로 바꿔라
		
		System.out.println("-----2-----");
		System.out.println(replacePhoneToken.apply(phone1));
		// function으로 만들어 놓은 후 지금처럼 불러서 사용하면 된다 
		// .replaceAll( ... )등등 일일이 적을필요는 없다
		System.out.println(replacePhoneToken.apply(phone2));
		

	}

}
