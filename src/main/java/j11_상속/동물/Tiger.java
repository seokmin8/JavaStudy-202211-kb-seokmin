package j11_상속.동물;

/*
    class = 변수 + 메소드
    super.move() => 호출
    class 에 가지는것은 변수와 메소드 호출이 아니라 <<<메소드 정의>>>!!!!!
    메소드 호출문을 사용하고 싶다면, 정의 안에 메소드 호출문을 포함 시킨다
 */

public class Tiger extends Animal{

    public Tiger(){
        System.out.println("Tiger 객체 생성됨!!!!");
    }

    // Ctrl + o

    public void move() {
        System.out.println("호랑이가 네발로 뛰어요");
    }

    public void move2() {
        super.move();
        System.out.println("호랑이가 네발로 뛰어요");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다");
    }
}
