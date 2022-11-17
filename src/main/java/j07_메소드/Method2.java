package j07_메소드;

public class Method2 {

    public static void print(String name) {
        System.out.println("이름 : " + name);
    }
    public static void print(int age) {
        System.out.println("나이 : " + age);
    }
    public static void print(String name, int age){
        System.out.println("이름 : " + name + " 나이 : " + age);
    }
    public static void print(int age, String name) {
        System.out.println("나이 : " + age + "이름 : " + name);
    }

    public static void main(String[] args) {

        print("황석민");
        print(3);
        print("황석민", 3);
        print(3, "황석민");
        // 오버로딩 할 때엔 리턴타입은 영향을 주지 않는다.
        // 자료형은 영향을 준다!
    }

}
