package j19_익명클래스;

public class CalcMain {

	public static void main(String[] args) {
		
//		Calculator c1 = (x, y) -> x + y; 	// 이걸 풀어서 설명하자면?
		
		// 대상(자료형)을 기준으로!
		// Calculator 안에 calc 메서드로서 자료형이 이미 지정되어 있어서 생략 가능!
		// 리턴도 생략할 수 있다 -> 다음 , return은 적으면 안된다! (중괄호 내에만 적을 수 있다)
		// 리턴이 포함되어야 할 중괄호도 생략할 수 있다, 
		// 단 중간에 다른 실행문이 없는 경우에만 가능하다
		// 다른 실행문이 있을 때 중괄호(구현부)를 사용하자
		// 람다의 조건! ( 항상 인터페이스 )
		// 인터페이스 안에 추상메소드가 단 1개만 존재해야 한다
		// 2개일 땐 람다식에서 어떤 메소드로 결정해야 할지 모르게 되어서 사용불가
		
		Calculator c1 = (int x, int y) -> {
			return x + y;
		}; // 이렇게 된다, 얘는 생성은 없고 정의만 있다
		// 메소드명, 자료형만 변경되지 않으면 어떤형태든 가능!
		
		// 이것과도 동일한 정의이다
		// 주소값 = 정의와 생성
		Calculator c = new Calculator() {
			
			@Override
			public int calc(int a, int b) {
				
				return a + b;
			}
		};
		
		
		// 람다 인터페이스에 정의되어 있는 일반 메서드는 사용 가능(호출)
		
		
		
//		Calculator c1 = new Calculator() {
//			// c1은 주소값 => 생성된게 heap 메모리에 할당이 되어야 한다
//			// 인터페이스는 생성이 안되는데?
//			// 1회용 틀이라 생각하자, 재사용 불가, new 부터 ~ }; 까지
//			
//			// 계속해서 생성하는게 아니라 임시적인 한번의 오버라이드로 아래 c1. c2. 등 호출을 한다
//			@Override
//			public int calc(int a, int b) {
//				System.out.println("덧셈");
//				return a + b;
//			}
//		};
		
		System.out.println("----1----");
		
		int r1 = c1.calc(10, 20);
		System.out.println(r1);
		int r3 = c1.calc(30, 40);
		System.out.println(r3);
		
		System.out.println("----2----");
		
		Calculator c2 = new Addition();
		int r2 = c2.calc(20, 30);
		System.out.println(r2);
		
		System.out.println("---------3---------");
		
		CalculatorSub cs = (x) -> x * x;
		
		System.out.println(cs.calc(10));
		System.out.println(cs.a());
		
	}

}
