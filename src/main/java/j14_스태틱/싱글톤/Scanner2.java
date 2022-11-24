package j14_스태틱.싱글톤;

import java.util.Scanner;

public class Scanner2 {

    public void inputage(){
        int age = 0;
        Scanner scanner = ScannerSingleton.getInstance().getScanner();
        // getInstance 까지는 앞의 값(주소값)을 가지고 있다
        // getInstance->생성없이 호출할 수 있다

        System.out.println("나이를 입력하세요: ");
        age = scanner.nextInt();

        System.out.println("나이: " + age);
    }
}