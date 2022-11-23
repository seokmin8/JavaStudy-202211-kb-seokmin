package j13_Object;

import java.util.Scanner;

public class StringTest {



    public static void main(String[] args) {

        String str = "A";
        String str2 = "A";
        System.out.println(str == str2);    // true => 리터럴을 알 수 있는 좋은 예 ( 어딘가 존재하는 A 의 주소를 가져감 )
        String str3 = new String("A");
        System.out.println(str == str3);    // false => new <-주소 할당 -> 다른 주소이기 때문에
        System.out.println(str.toString());




//        // 둘다 클래스 이지만 import는 Scanner만 한다??! -> String은 jdk.base에 존재하는 클래스
//        Scanner sc = new Scanner(System.in);
//
//        Integer integer = 100;
//        System.out.println(integer);

//        Object object = new Object();   // 최상위,

    }
}
