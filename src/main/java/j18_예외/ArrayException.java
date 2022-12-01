package j18_예외;

public class ArrayException {

	public static void main(String[] args) {
		Integer[] numberArray = new Integer[] {1, 2, 3, 4, 5};
		
		// 예외가 발생할 수 있는 구간에 try{  }catch 로 묶어준다
	try {
		for(int i = 0; i < 6; i++) {	// 배열의 인덱스값 보다 for문의 값이 커서 예외발생
			System.out.println(numberArray[i]);
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);	// e 주소값
		e.printStackTrace();	// 출력시 빨간색(예외발생 부분) 표시
		System.out.println("====== 1 =======");
		System.out.println(e.getMessage());	// 예외 발생 메세지 표시
		System.out.println("예외 생성됨");
		}
		
		
		
		System.out.println("프로그램 정상 종료");
		
		
	}
	
}
