package j16_컬렉션.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {
	
	// alt. shift. s -> 옵션!!
	
	public static void main(String[] args) {
		
		Set<String> nameSet = new HashSet<String>();
		
		nameSet.add("황석민");
		nameSet.add("김수현");
		nameSet.add("문경원");
		nameSet.add("권용범");
		nameSet.add("이영인");
		
		System.out.println(nameSet);
		System.out.println("---------");
		// Set -> 순서가 없다 = 인덱스가 없다!
		// get이 없어서 하나만 값을 빼오지 못한다
		// for-each문으로 조건 확인 후 맞는 값 하나만 출력하고 종료
		for(String s : nameSet) {
			if(s.equals("문경원")) {
			System.out.println(s);
			break;
			}
		}
		System.out.println("---------");
		
		List<String> nameList = Arrays.asList(new String[] {"김준일", "권용범"});
		
		System.out.println(nameList);
		
		Set<String> listToSet = new HashSet<String>();
		listToSet.addAll(nameList);
		// list를 set으로 전부 다 옮기고 싶을 때 addAll을 쓴다.
		// 컬렉션은 addAll을 다 쓸 수 있다
		// Map은 사용하지 못한다! (컬렉션을 상속받지 않고 따로 존재하기 때문)
		
		System.out.println(listToSet);
		
		nameSet.remove("황석민");
		// remove를 호출, 원하는 값을 직접 삭제가능
		
		System.out.println(nameSet);
		
		// 값 자체가 키 값이기 때문에 Update는 없다!
		// 지우고 다시 넣어야 그 기능을 대신하는 것 (삭제와 추가 뿐)
		
	}
}
