package j14_스태틱.싱글톤;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner1 s1 = new Scanner1();
        Scanner2 s2 = new Scanner2();

//        Scanner sc = new Scanner(System.in);    //1-3) 이렇게 되면 계속 전달을 해줘야하는 상황
//        ScannerSingleton scannerSingleton = new ScannerSingleton(); // 외부에서 생성되지 않음

        s1.inputName();
        s2.inputage();
    }
}
