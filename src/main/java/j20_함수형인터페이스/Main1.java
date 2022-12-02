package j20_함수형인터페이스;

public class Main1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		Runnable application1 = () -> {
			System.out.println("프로그램을 시작합니다.");
			System.out.println("a : " + a);
		};
		// 메소드 안에서 쓰기 위해선 매개변수로 값을 받아야 하는데 없이 사용된다
		// 매개변수가 없을 때 생략은 불가능!! , 하나일 때 생략 가능
		// 메소드 내부에서 메소드를 정의할 수 있다
		
		application1.run();
		
//		Runnable timer = () -> {
//			for(int i = 0; i < 100; i++) {
//				System.out.println(i + " : " + (i + 1));
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		};
		// 위와 같은 정의 말고도 아래처럼도 사용가능!
		
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				System.out.println(i + " : " + (i + 1));
				try {
					System.out.println("채팅기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				System.out.println(i + " : " + (i + 1));
				try {
					System.out.println("알림기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		// 비동기 처리 = 실행문들이 서버의 응답여부에 관계없이 진행된다
		// 동기 처리 => 서버측에서 응답이 돌아와야 처리가 이루어진다
	}
}
