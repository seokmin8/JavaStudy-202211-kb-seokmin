package j12_추상.추상클래스;


// 추상7) 컴파일 에러가 뜨는 이유는 기본 생성자를 정의하지 않아서
public class Tiger extends Animal{
    // 추상9-2) 기본형태의 기본생성자를 만들어주면 해결됨

    public Tiger(String kind){
        super(kind);
    }

//    public Tiger(String name) {     // 추상8) 기본생성자를 오버로딩되면 생략되어있던
//        // 기본생성자는 죽고 오버로딩 된 생성자를 사용한다
//        super(name);
//    }

    @Override
    public void move() {
        System.out.println("호랑이가 네발로 뛰어용");
    }
}
