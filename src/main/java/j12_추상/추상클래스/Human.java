package j12_추상.추상클래스;

public class Human extends Animal{

    public Human(String kind){
        super(kind); // animal의 생성자!!
    }

    // Human 기본 생성자를 사용하고 싶다면
//    public Human(){
//        super("String name 값"); // super 생성자 매개변수 값이 비어있으면 안됨

    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다");
    }
}
