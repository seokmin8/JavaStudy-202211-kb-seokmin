package j21_문자열메소드;

public class StringMethod {

	public static void main(String[] args) {
		
		String name = "황석민최형배";
		
		System.out.println("length");
		System.out.println(name.length());
		// 문자열.length 는 메소드 (길이)
		// 문자의 위치 찾기 = 인덱스 위치 0, 1
		System.out.println("해당 문자의 인덱스 값");
		System.out.println(name.indexOf("민"));
		System.out.println(name.indexOf("석"));
		
		System.out.println("뒤에서부터 찾기");
		// 문자의 위치 뒤에서부터 찾기
		System.out.println(name.lastIndexOf("황"));
		
		
		// 인덱스의 값 출력
		char name1 = name.charAt(0);
		System.out.println(name1);
		
		char name2 = name.charAt(name.indexOf("석"));
		System.out.println(name2);
		
		String subName1 = name.substring(0, 2);
		// 2번째 값 전까지 0,1 이 해당됨!
		String subName2 = name.substring(2);
		// 만약 뒤의 ~까지 값이 안들어 갔을 때 2부터 
		System.out.println(subName2);
		
		String subName3 = name.substring(0, 3);
		System.out.println(subName3);
		
		String nameSm = "황석민";
		
		System.out.println(name.substring(name.indexOf(nameSm),name.indexOf(nameSm) + nameSm.length()));
		
		String file = "C:/String.java";
		String fileName = null; // 이름
		String extension = null; // 확장자
		
//		fileName = (file.substring(file.indexOf("C:/"), file.indexOf(extension)));
		// substring = 찾는다 (어디부터? c:/(글자개수 3) 부터, 그리고 뒤에서부터 .을 찾자
		
		fileName = file.substring("C:/".length(), file.lastIndexOf("."));
		System.out.println(fileName);
		extension = file.substring(file.lastIndexOf("."));
		System.out.println(extension);
		
		
	}

}
