package j03_연산자;

public class Operation2 {
    public static void main(String[] args) {

        // 증감연산자는 단항연산! = 값이 있다

        int num = 10;

        num++;  // 이 자리에서는 1이 더해지지 않음 (다음 행)
        ++num;  // 이 자리에서 1이 더해짐
        System.out.println(num);
//        System.out.println(num++);  12 출력
//        System.out.println(++num);  13 출력
    }
}
