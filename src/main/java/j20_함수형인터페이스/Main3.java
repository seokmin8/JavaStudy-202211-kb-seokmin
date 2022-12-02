package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Main3 {
	
	public static void forEachTest(Consumer<String> consumer, List<String> list) {
		for(String s : list) {
			consumer.accept(s);
		}
	}
	
	
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		//
		
		names.add("임지현");
		names.add("신경수");
		names.add("고희주");
		names.add("문승주");
		names.add("장건녕");
		
		names.forEach(n -> {	
			// n은 컨슈머를 생성할때 <? super T> 자리의 T의 자료형을 따라가야된다 List <String>
			// forEach는 결국 메소드
			// 메소드 내에는 값이 들어가야한다 어떤형태? Consumer 인터페이스로 구현된 객체 (업캐스팅 상태로)
			// 람다는 구현과 생성이 한번에!! 
			System.out.println(n);
			// accept 라는 메소드가 오버라이드 된것이 위(람다식) 형태!!
		});
		
		/*
		 *  default void forEach(Consumer<? super T> action) {
        	
        	Objects.requireNonNull(action);
        		Null이 아닌대상이 필수!(lambda)
        	
        	for (T t : this) {
        		  n  : names
        		String   자기자신! = list
        		  
            action.accept(t);
           위의 람다.     n
        		}
    		}
		 * 
		 */
		
		System.out.println();
		
		forEachTest(n -> {System.out.println(n);}, names);
		// 매개변수 = 컨슈머 객체, 리스트
		// foreach로 리스트를 돌리고 하나씩 꺼낼 수 있다
		// println(n); }; 까지가 accept 
	}

}
