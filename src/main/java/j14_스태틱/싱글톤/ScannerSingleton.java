package j14_스태틱.싱글톤;

import lombok.Getter;

import java.util.Scanner;

public class ScannerSingleton {

//1-1) (public) private static Scanner staticScanner = new Scanner(System.in);
    // 다른곳에서 데이터를 변경할 위험에 노출 됨
    // 위와같이 사용할 수 있지만 계속해서 생성되는것을 막기 어려움.
//1-2)  public static Scanner getScanner(){
//        retrun staticScanner; }
//      이렇게 사용할 수 있지만, 문제가 많다 (접근제어를 하더라도 다른부분까지)

    // 2. 자기 자신을 static 변수로 가져야 한다!
    private static ScannerSingleton instance = null;    // 싱글톤 변수 instance 는 항상 고정이다!
    // 단 하나 만들어진 객체에 Scanner가 들어가있다?

    // 게터를 주고 싶은 변수위에
    @Getter
    private Scanner scanner;
    // private 이기 때문에 게터를 만들어준다
    // 여기서 getScanner(인스턴스) 가 만들어짐

    // 싱글톤 특징!
    // 1. 생성자가 private 이어야 한다
    private  ScannerSingleton(){    // 생성자, private 이라 클래스 내에서만 접근가능! 외부에선 생성도 되지 않음!
        scanner = new Scanner(System.in);
        // 여기의 주소가 static instance 에 똑같이 들어가 있다
        // 싱글톤이 생성되면 스캐너를 겟! 할 수 있다
    }
    //
    public static ScannerSingleton getInstance(){   // 리턴은 ScannerSingleton 객체를 리턴! = instance
        if(instance == null) {  // if가 없다면 계속 생성하게 된다. 그것을 방지! 하지만 값이 없을 땐 생성!
            instance = new ScannerSingleton();  // 내부에서 생성!
            // 첫 호출 때 비어있기 때문에 생성해서 넣어준다
            // 첫 호출 이후부터 null 상태가 아니게 되고, instance를 리턴하지만
            // 모두 static 이어서 값을 하나로 공유하게 된다
        }
        return instance;
        //원래 역할인 주소값 반환!
    }
}
