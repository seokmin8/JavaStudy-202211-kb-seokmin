package j11_상속.동물;

public class AnimalMain2 {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Human human = new Human();
        Tiger tiger = new Tiger();

        Animal[] animals = new Animal[5];   // Animal만 들어갈 수 있는 배열 공간(상속포함)
        // 아래처럼 객체 생성이 되면 같은공간에 각각 메모리 할당! new => Animal Human , Animal Tiger
        // Human h = new Human() => Animal h = new Human() 이 될 수 있다
        // 업캐스팅 하게되면 Human (상위객체로 할당) 접근불가 << 메모리 할당값은 사용불가
        animals[0] = new Human();
        // 다운캐스팅 - 하위 객체로 할당
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();
        animals[4] = new Human();

        System.out.println("--------------------");

        tiger.move();


        System.out.println("[업캐스팅]");

        for(int i = 0; i < animals.length; i++){
            animals[i].move();
        }
        System.out.println("[다운캐스팅]");
        for(int i =0; i< animals.length; i++){
            // animals[i] 공간속에 있는 객체가 뭔지 모르는 상태, Human으로 다운캐스팅을 해야 Human이 된다
            if(animals[i] instanceof Human) {   // 먼저 하나씩 꺼내서 확인해본다 (Human과 맞는지)
                ((Human) animals[i]).readBooks();   // Human으로 다운캐스팅, Human 자체가 주소를 가진다
                // <<다운캐스팅>>은 괄호로 묶어주는걸 생각하자
                // animals[i]에 readBooks 한걸 Human에서 readBooks한것으로 인식하게끔 괄호로 묶자!
                } else if(animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).hunting();
            }
        }
    }
}