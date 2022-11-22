package j12_추상.추상클래스;
/*
    추상 메소드를 하나라도 포함하는 클래스는
    추상 클래스로 정의하여야 한다 => 설계도!!
 */

public abstract class Animal {
    // 추상3) 일반 변수도 정의 가능하고 일반 메소드도 정의 가능하다
    private String name;

    public Animal(){

    }

    public Animal(String name){ // 추상5) 일반 생성자도 정의 가능하다 , 기본생성자는
        this.name = name;
        System.out.println(name + "이 생성되었음");
    }
    public Animal(int age){
        System.out.println(age + "살 입니다");
    }

    // 추상5) 추상 클래스를 상속하는 자식 개체에서는 구현이 가능하다

    // 추상4) 일반 메소드도 정의가능하지만 추상메소드가 존재하냐 마냐가 일반클래스와 차이
    public void eat(){
        System.out.println("동물이 밥을 먹습니다");
    }
    // 추상2) 이 부모클래스의 이 메서드는 추상메서드가 된다

    public abstract void move(); // 추상 메소드는 구현부가 없음
//        System.out.println("동물이 움직입니다");  << 동물은 움직인다? 라는 정의 설명정도!

    // 해당 메서드는 사용이 목적이 아니라 오버라이드가 목적이다
    // 묶어서 한번에 제어를 위함!!

}
