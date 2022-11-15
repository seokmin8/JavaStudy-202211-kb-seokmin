package j04_입력;

import java.util.Scanner;

public class Input1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//      참조자료형 변수명 = 클래스생성
        String name = null;
        int age = 0;
        String phone = null;
        String address = null;
//      .next() .nextLine() 의 차이는 여백(스페이스바, 엔터)의 인식차이

        name = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        // nextInt() 에 데이터 입력시 우리는 입력 후 enter를 넣는데 이 값이 버퍼에 남아있는 상태이고 그 엔터값을 담아줘야 하는곳을 만들어준다
        phone = sc.nextLine();
        address = sc.nextLine();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + phone);
        System.out.println("주소 : " + address);


    }
}
