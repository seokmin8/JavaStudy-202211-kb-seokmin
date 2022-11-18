package j09_접근지정자;

public class Access2 {
    int age;

    public Access2() {} // 컴파일러가 기본적으로 만들어주는 기본 생성자!!

    void printAge(){
        System.out.println("age : " + age);
    }
}
