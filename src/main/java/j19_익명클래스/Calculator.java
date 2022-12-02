package j19_익명클래스;

@FunctionalInterface
public interface Calculator {
	// 람다로 쓰는 인터페이스에 @FunctionalInterface 걸어주자
	// 메소드가 2개 이상이 되면 컴파일 에러를 발생 시킨다

	public int calc(int a, int b);
	// a, b 두개보다 그 이상 사용하고 싶을 땐 클래스를 더 생성하거나
	// int를 배열로 받아줘야 한다
	
//	public int calc(int c, int d);
	
	public default int a() {
		return 10;
	}
	// default 메소드는 @FunctionalInterface 내부에 들어올 수 있다
	// 오버라이드에 영향을 주지않기 때문에!!!
	
	
}
