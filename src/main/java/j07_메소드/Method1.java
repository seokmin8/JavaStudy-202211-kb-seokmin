package j07_메소드;

public class Method1 {

    // 메소드들 정의!
    public static void method1() {
//     static은 항상 | 반환형 이름(매개변수) void => 반환값이 없다
        System.out.println("메소드1 호출");
        System.out.println();
        method2(100);
    }
    public static void method2(int a) {  //  매개변수를 매소드 내에서 활용한다(지역변수)
            System.out.println("메소드2 호출");
            System.out.println("매개변수 a: " + a);
            System.out.println();

    }
    // 반환값이 int형인 메소드3
    // 메인이 메소드3에게 int a,b의 값을 전달한다
    // 메소드3는 메인에게 a와 b의 리턴값을 돌려준다
    public static int method3(int a, int b) {
        System.out.println("메소드3 호출");
        System.out.println("매개변수 a: " + a);
        System.out.println("매개변수 b: " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println();
        return a + b;   // 리턴 때 a와 b를 합한다
    }
    // 반환값을 if문에 따라 다르게 줄 수 있다
    // 메소드 반환값이 int이면 무조건 값이 return이 되어야 한다!!
    public static int max(int a, int b) {
        int result = 0;

        if(a < b) {
            result = b;
        } else {
            result = a;   // return을 만나면 메소드 탈출
        }
        return result;
    }

    // 다른 메소드에서도 메소드를 호출 할 수 있다

    public static void main(String[] args) {    // 메인 내에서 메소드 호출!
        method1(); // method1 콜~!
        System.out.println("메소드1 호출 후 출력");
        method2(10);
        int result1 = method3(3000, 7000);  // method3의 동작의 결과(값)를 result1에 대입한다
        System.out.println("result: " + result1);
    }
}
