package j06반복;

import java.util.Scanner;

public class Loop6 {

    public static boolean selectionConditions(String select, int a, int b) {

        boolean loopFlag = true;

        if (select.equals("1")) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (select.equals("2")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (select.equals("3")) {
            System.out.println(a + " x " + b + " = " + (a * b));
        } else if (select.equals("4")) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else if (select.equals("5")) {
            System.out.println(a + " % " + b + " = " + (a % b));
        } else if (select.equals("q")) {
            loopFlag = false;   // false가 되어 if문을 나간 후 메소드에서 loopFlag를 반환한다
        } else {
            System.out.println("잘못된 입력! 다시 입력하세요.");
        }
        return loopFlag;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        Scanner sc = new Scanner(System.in);
        String select;
        boolean loopFlag = true;

        while (loopFlag) {
            select = null;
            System.out.println("1. 덧셈");
            System.out.println("2. 뺄셈");
            System.out.println("3. 곱셈");
            System.out.println("4. 나눗셈");
            System.out.println("5. 나머지");
            System.out.println("q. 프로그램 종료");
            System.out.print("[메뉴 선택]");
            select = sc.nextLine();

            loopFlag = selectionConditions(select, a, b);
            // 반환값이 boolean 이어야 한다
            System.out.println();
        }
    }
}


//            if (select.equals("1")) {
//                System.out.println(a + " + " + b + " = " + (a + b));
//            } else if (select.equals("2")) {
//                System.out.println(a + " - " + b + " = " + (a - b));
//            } else if (select.equals("3")) {
//                System.out.println(a + " x " + b + " = " + (a * b));
//            } else if (select.equals("4")) {
//                System.out.println(a + " / " + b + " = " + (a / b));
//            } else if (select.equals("5")) {
//                System.out.println(a + " % " + b + " = " + (a % b));
//            } else if (select.equals("q")) {
//                break;
//            } else {
//                System.out.println("잘못된 입력! 다시 입력하세요.");
//            }
//        }

        /*
        1. 덧셈
        2. 뺄셈
        3. 곱셈
        4. 나눗셈
        5. 나머지
        q. 프로그램 종료
        (나머지 다른 입력은 "잘못된 입력! 다시 입력하세요. ")
         */