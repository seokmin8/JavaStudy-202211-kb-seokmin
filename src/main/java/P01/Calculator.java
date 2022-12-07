package P01;

public class Calculator {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(10, 20));
		
		System.out.println(cal.sub(200, 100));
		
	}
	
}
