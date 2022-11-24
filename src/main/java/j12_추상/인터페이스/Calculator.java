package j12_추상.인터페이스;
/*
    추상 클래스는 일반 클래스와 동일하지만 추상 메소드를 포함할 수 있다
    인터페이스는 기본적으로 모든메소드가 추상메소드 이다!
    구현부가 있는 메소드는 사용불가
    일반변수 사용불가 = 선언불가
    상수는 선언할 수 있다
    ㄴ> 모든 변수선언은 상수로 선언된다
    일반 메소드를 선언하고 싶으면!! abstract( X ) default ( O ) 사용한다
 */

public interface Calculator {

//    public Calculator(){}  인터페이스는 생성자가 없다!! 변수가 없기때문!!
//    private String name;  일반변수 사용불가
//    public String name;  일반변수 사용불가

    public int ERROR_CODE = -9999999;   // 선언 됨 (FINAL 생략가능) 보통(상수) 잘 사용하지 않는다
//    private int ERROR_CODE2 = -9999999;   선언되지 않음.

    public int calc(int[] values);      // 이런 메소드를 주로 사용한다 - (인터페이스)

    public default void setErrorCode(){
//        ERROR_CODE1 = 10;     상수라서 초기화 안됨
    }
}


// 인터페이스 -> 추상클래스와 달리, 다중 구현이 가능하다