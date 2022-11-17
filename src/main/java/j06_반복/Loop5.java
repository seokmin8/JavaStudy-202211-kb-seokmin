package j06_반복;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String select = null;
        boolean loopflag1 = true;
        boolean loopflag2 = true;

        while (loopflag1) {
            System.out.println("[폴더 선택]");
            System.out.println("1. 문서");
            System.out.println("2. 음악");
            System.out.println("3. 사진");
            System.out.println("4. 동영상");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴선택: ");
            select = sc.nextLine();

            if (select.equals("1")) {
                while(loopflag2) {
                    System.out.println("[1. 문서]");
                    System.out.println("1. 대학서류");
                    System.out.println("2. 개인자료");
                    System.out.println("3. 기업정보");
                    System.out.println("b. 뒤로가기");
                    System.out.println("q. 프로그램 종료");
                    System.out.print("메뉴선택: ");
                    select = sc.nextLine();
                    if (select.equals("1")) {

                    } else if (select.equals("2")) {

                    } else if (select.equals("3")) {

                    } else if (select.equals("b")) {
                        break;
                    } else if (select.equals("q")) {
                        System.out.println("정말 프로그램을 종료 하시겠습니까? (y/n)");
                        select = sc.nextLine();
                        if (select.equals("y")) {
                            loopflag1 = false; // 내부 외부 두개의 while 모두종료
                            loopflag2 = false;
                        }
                    } else {
                        System.out.println("다시 입력하세요");
                    }
                }
            } else if (select.equals("2")) {

            } else if (select.equals("3")) {

            } else if (select.equals("4")) {

            } else if (select.equals("q")) {
                System.out.print("정말 프로그램을 종료 하시겠습니까? (y/n) ");
                select = sc.nextLine();
                if (select.equals("y")) {
                    break;
                }
            } else {
                    System.out.println("다시 입력하세요");
                }
            }
        }
}
