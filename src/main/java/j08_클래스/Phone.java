package j08_클래스;

public class Phone {

    String company;
    String model;

    Phone(){ // 기본 생성자의 형태
        System.out.println(" 기본 생성자 호출 ");
    }

    Phone(String c, String m) {     // 사용자 정의 생성자
        System.out.println("사용자 정의 생성자 호출됨!!!!!!! 주소값을 할당");
        System.out.println();
        company = c;    // 생성자 오버로딩! (매개변수)
        model = m;      // 기본 생성자는 (매개변수값 없다)
    }
    // 생성자 -> 오버로딩(사용자 정의 생성자)이 되면 기본생성자를 사용할 수 없다

    void printPhoneCompany(){
        System.out.println("제조사 : " + company);
        System.out.println();
    }
    void printPhoneModel(){
        System.out.println("모델명 : " + model);
        System.out.println();
    }
}
