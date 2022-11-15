package j03_연산자;

/*
    논리연산
     && (AND) - 논리곱
     || (OR)  - 논리합
     ! (NOT)  - 부정문

     true = 1
     false = 0

     true && true = true ( 1 x 1 = 1 )
     true && false = false ( 1 x 0 = 0 )

     true || false = true ( 1 + 0 = 1 )
     false || false = false ( 0 + 0 = 0 )

     !(true && true) = false ( 1의 부정 = 0 )
 */

public class Operation1 {

    public static void main(String[] args) {

        boolean a = 100 % 4 ==0;
        boolean b = false;



        System.out.println("<<<< AND >>>>");
        System.out.println(a && a);
        System.out.println(a && b);
        System.out.println(b && b);
        System.out.println("<<<< OR >>>>");
        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || b);
        System.out.println("<<<< NOT >>>>");
        System.out.println(!(a && a));
        System.out.println(!(a && b));
        System.out.println(!(a || a));
        System.out.println(!(b || b));

    }
}
