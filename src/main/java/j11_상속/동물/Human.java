package j11_상속.동물;

public class Human extends Animal{

    public Human(){
        super(); // <<< 부모생성자가 생략되어있어서 Animal객체 생성이 명령없이 됨 , 기본생성자와 비슷
        // 생성될 때 Human 과 Animal의 객체는 함께 생성이 되지만 주소는 같지않다~~!
        // 자식개체 내에서 super. 이 되면 부모객체 주소 호출
        // 자식개체 내에서 자기자신 생성자 호출 this() 부모생성자 super()
        // 부모클래스 안의 private을 제외한 모든기능은 자식이 사용할 수 있다
        // 업캐스팅을 하게 되면 자식개체는 사용불가 부모개체 활성
        // 다운캐스팅 = 자식개체를 다시 살려줌

        System.out.println("Human 객체 생성");
    }

    // Ctrl + o
    @Override   // @가 붙어있는 문법 -> 어노테이션
    public void move(){
        System.out.println("사람이 두 발로 걷습니다");
    }

    public void readBooks(){
        System.out.println("사람이 책을 읽습니다");
    }

}
