package j18_예외;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class CustomException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	// 직렬화
	// alt + shift + s => 오버라이드
	
	Map<String, String> errorMap;
	
	public CustomException() {
		super();
		// 부모클래스 생성자 호출
	}
	public CustomException(String message) {
		super(message);
	}
	public CustomException(Map<String, String> errorMap) {
		super();
		this.errorMap =  errorMap;
	}
	public CustomException(String message, Map<String, String> errorMap) {
		super(message);
		this.errorMap = errorMap;
	}
	
	public void printErrorMap() {
		
		Objects.requireNonNull(errorMap);
		// 만약? errorMap이 null 일 때 null point Exception을 띄우고 아래는 실행이 되지않는다
		
		for(Entry<String, String> entry : errorMap.entrySet()) {
			System.out.println(entry.getKey() + " >>> " + entry.getValue());
		}
		
		System.out.println();
		
	}

}
