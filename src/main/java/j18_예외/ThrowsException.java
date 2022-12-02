package j18_예외;

public class ThrowsException {

	public static void printArray(int[] numbers) throws Exception {
		// throws Exception 을 하면 예외가 뜰 자리에 빨간줄이 발생! 
		for(int i = 0; i < 6; i++) {
			System.out.println(numbers[i]);
		}
	}
	// 정의할 때 부터 예외가 일어날 수 있는 메소드, 예외발생을 호출 시점으로 미루어준다 ( throws Exception )
	
	public static void main(String[] args) throws Exception{
//	public static void main(String[] args) {
		// main에서 throws 하게되면 jvm까지 예외발생이 미루어짐
		
		int[] nums = new int[] {1, 2, 3, 4, 5};
		
		try {
			printArray(nums);
			// 빨간줄 발생 시 try catch문으로 강제로 묶어줌
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			// 예외가 둘중 하나일 때? or로 표현
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
	}
	
}
