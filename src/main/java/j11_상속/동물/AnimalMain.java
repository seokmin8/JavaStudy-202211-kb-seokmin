package j11_상속.동물;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Tiger tiger = new Tiger();

        int a = (int) 3.14; // 다운캐스팅
        double d = (double) 3; // 업캐스팅

        Animal hAnimal = (Animal)human;     // 형변환! human 앞에 생략(생략가능 = 업캐스팅!)
        // Animal은 human을 포함할 수 있다
        Animal tAnimal = tiger; // 업캐스팅!!
        Animal[] animals = new Animal[3]; // 동물우리를 만든것과 같다~ 3칸!

        animals[0] = new Human();
        animals[1] = new Tiger(); // Animal 자료형이기 때문에 human도 포함할 수 있음
        animals[2] = new Animal();

        for(int i=0; i < animals.length; i++){
            animals[i].move();
        }
        // 상속해서 재정의 = 완전히 바꾼다! = 재정의 된 녀석을 사용
        // (상속관계에서)자식개체는 부모객체없이는 생성되지 않는다
        // 큰값의 객체를 작은값의 객체주소로 대체 => 업캐스팅(super의 주소)

        ////////////////////////////////////////////////////
        for(int i = 0; i < animals.length; i++){
            if(animals[i] instanceof Human) {   // animals 와 Human 자료형 확인 instanceof
                Human h = (Human) animals[i];
                h.readBooks();
            } else if (animals[i] instanceof  Tiger) {
                Tiger t = (Tiger) animals[i];
            } else {
                System.out.println("다운캐스팅 불가!");
            }
        }



//        animals[0] // human 이 들어있는 상태에서
//
//        for(int i = 0; i < animals.length; i++) {
//            Human h = (Human) animals[i]; // 다운캐스팅이다 , 자료형은 명시!!!!!!
//            h.readBooks();
//        }
//              잘못된 사용의 예
//              tiger를 human으로 넣고 있기때문에 오류발생!

            // [0] human이 들어있지만 readBooks가 사용되지 않음
            //

    }
}
