package j12_추상.추상클래스;

import java.util.Scanner;

public class AnimalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Animal animal = null;   // null << 주소가 비었다 (자료형이 클래스인 변수에 사용!!) 참조 자료형

        while(true) {
            String select = null;

            System.out.println("1. 사람");
            System.out.println("2. 호랑이");
            System.out.println("q. 종료");

            System.out.println("동물을 선택하세요 ");
            select = sc.nextLine();

            if(select.equals("1")){
                animal = new Human("사람");   // 1인 경우 animal = Human을 할거임
            } else if(select.equals("2")){
                animal = new Tiger("호랑이");

            }else if (select.equals("q")){
                break;
            }else {
                System.out.println("다시 입력하세요");
            }
            if(select.equals("1") || select.equals("2")){
                animal.move();  // animal >> . << 공통적인 조건! 사람, 호랑이
                //animal 클래스에 move가 있어서 사용가능!!
            }
            System.out.println();
        }

//        Animal[] animals = new Animal[2];
//
//        animals[0] = new Human(); // 생성자 호출됨!
//        animals[1] = new Tiger();   // 추상9-1) 이 형태의 생성자를 호출하기 위해선??
//
//        for(int i = 0; i < animals.length; i++){
//            animals[i].move();
//        }

//        Animal animal = new Animal();  //추상6) 이렇게 사용은 불가능!!
        // 추상클래스는 원!래! 생성이 안된다

//        animal.move(); // 추상1) 아무 동작없는 이 메서드를 설계하지 않고
        // 틀을 만들어 이용하기 위한것이 추상!!!( abstract )

        // 추상 ) 추상클래스에 추상메소드가 반드시 포함되어야 하는건 아니다!!
    }
}
